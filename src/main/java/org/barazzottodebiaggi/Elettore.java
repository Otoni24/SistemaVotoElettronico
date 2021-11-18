package org.barazzottodebiaggi;

import java.util.Arrays;

public class Elettore extends Utente {

	public Elettore(String name, String family_name, int day, int month, int year, char sex, String birthplace, String birthstate, String cf) {
		set_Nome(name);
		set_Cognome(family_name);
		set_data_nascita(day, month, year);
		set_sesso(sex);
		set_birthplace(birthplace, birthstate);
		set_codice_fiscale(cf.toCharArray());
	}
	
	
	//attributi
	private /*@ spec_public @*/ int currentDay = 11;
	private /*@ spec_public @*/ int currentMonth = 11;
	private /*@ spec_public @*/ int currentYear = 2021;
	private String nome;
	private String cognome;
	private int day;
	private int month;
	private int year;
	private char sesso;
	private String luogo_nascita;
	private String nazione_nascita;
	private char[] codice_fiscale;
	private /*@ spec_public @*/ boolean voto;
	
	//metodi
	//nome
	//@ requires nome != null;
	public void set_Nome (String nome) {
		this.nome=nome;
	}
	//@ ensures \result != null;
	public String get_Nome() {
		return this.nome;
	}
	//@ requires cognome != null;
	public void set_Cognome (String cognome) {
		this.cognome=cognome;
	}
	//@ ensures \result != null;
	public String get_Cognome() {
		return this.cognome;
	}
	//@ requires year < currentYear-18 || (year == currentYear-18 && month < currentMonth) || (year == currentYear-18 && month == currentMonth && day <= currentDay);
	//@ requires year < currentYear || (year == currentYear && month < currentMonth) || (year == currentYear && month == currentMonth && day <= currentDay);
	//@ requires month <= 12 && day <= 31;
	public void set_data_nascita(int day, int month, int year){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int get_day() {
		return day;
	}
	public int get_month() {
		return month;
	}
	public int get_year() {
		return year;
	}
	
	//@ requires sesso == 'M' || sesso == 'F';
	public void set_sesso (char sesso) {
		this.sesso=sesso;
	}
	//garantito dal setter siccome variabile privata e non accessibile
	public char get_sesso() {
		return this.sesso;
	}
	//@ requires (nazione_nascita == "Italia") ==> (luogo_nascita != null);
	public void set_birthplace (String luogo_nascita, String nazione_nascita) {
		this.luogo_nascita=luogo_nascita;
		this.nazione_nascita=nazione_nascita;
	}
	public String get_birthplace() {
		return this.luogo_nascita;
	}
	public String get_birthstate () {
		return this.nazione_nascita;
	}
	//codice fiscale
	//@ requires checkCF(codice_fiscale) == true;
	public void set_codice_fiscale(char[] codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public char[] get_codice_fiscale() {	
		return this.codice_fiscale;
	}

	//voto
	//metodo booleano che permette di controllare se un Elettore abbia gi� votato per l'evento
	public /*@ pure @*/ boolean esprimi_voto (boolean voto) {
		if(voto) return true;
		else {
			return false;
		}
	}
	//@ requires voto == false;
	public void set_vote(){
		this.voto = true;
	}
	
	private /*@ spec_public pure @*/ boolean checkCF(char[] codice_fiscale){
		String consCheck = "";
		consCheck += threeConsonants(this.cognome);
		consCheck += threeConsonants(this.nome);
		if (Arrays.copyOfRange(codice_fiscale, 0, 6) != consCheck.toCharArray()){
			return false;
		}
		if (("" + this.year % 100).toCharArray() != Arrays.copyOfRange(codice_fiscale, 6, 8)){
			return false;
		}
		if ((char)this.month + 64 != codice_fiscale[8] ){
			return false;
		}
		int dayInt = this.day;
		if (this.sesso == 'F'){
			dayInt += 40;
		}
		char[] dayChar = new char[2];
		char[] fixDayChar = ("" + dayInt).toCharArray();
		if (fixDayChar.length ==1){
			dayChar = new char[]{0, fixDayChar[0]};
		}
		if (dayChar != Arrays.copyOfRange(codice_fiscale, 9, 11)){
			return false;
		}
		if (this.nazione_nascita!="Italia" && codice_fiscale[11] != 'Z'){
			return false;
		}
		if (codice_fiscale[12] > 9 || codice_fiscale[13] > 9 || codice_fiscale[14] > 9 ){
			return false;
		}
		if (codice_fiscale[15] < 65 || codice_fiscale[15] > 90){
			return false;
		}
		return true;
	}
	
	private String threeConsonants(String s){
		String tempCF = "";
		String nameVow = "";
		for (int i=0; tempCF.length() < 3 && i<s.length(); i++) {
			if (isConsonant(s.charAt(i))){
				tempCF+=Character.toUpperCase(s.charAt(i));
			} else {
				nameVow+=Character.toUpperCase(s.charAt(i));
			}
		}
		if (tempCF.length() < 3) {
			nameVow += "XXX";
			for (int i=0; tempCF.length() < 3; i++){
				tempCF += Character.toUpperCase(nameVow.charAt(i));
			}
		}
		return tempCF;
	}
	
	/*private boolean isVowel(char c){
	    String vowels = "aeiouAEIOU";
	    return vowels.contains(Character.toString(c));
	}*/

	private boolean isConsonant(char c){
	    String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	    return cons.contains(Character.toString(c));
	}
	
	//metodo main solo per testing
	public static void main(String args[]){
		Elettore elettore = new Elettore("", "Barazzotto", 2, 4, 1999, 'A', "Biella", "Italia", "BRARCR99D02859K");
		System.out.println(elettore.get_codice_fiscale());
		System.out.println(elettore.get_sesso());
	}

}
