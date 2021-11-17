package org.barazzottodebiaggi;

public class Elettore extends Utente {

	public Elettore() {
		// TODO Auto-generated constructor stub
	}
	//attributi e metodi
	
	//nome
	public String nome;
	public void set_Nome (String nome) {
		this.nome=nome;
	}
	public String get_Nome() {
		return this.nome;
	}
	//cognome
	public String cognome;
	public void set_Cognome (String cognome) {
		this.cognome=cognome;
	}
	public String get_Cognome() {
		return this.cognome;
	}
	//data di nascita
	public int giorno_nascita;
	public void set_birthday (int giorno_nascita) {
		this.giorno_nascita=giorno_nascita;
	}
	public int get_birthday () {
		return this.giorno_nascita;
	}
	public int mese_nascita;
	public void set_birthmonth (int mese_nascita) {
		this.mese_nascita=mese_nascita;
	}
	public int get_birthmonth () {
		return this.mese_nascita;
	}
	public int anno_nascita;
	public void set_birthyear (int anno_nascita) {
		this.anno_nascita=anno_nascita;
	}
	public int get_birthyear () {
		return this.anno_nascita;
	}
	//sesso
	public boolean sesso;
	public void set_sesso (boolean sesso) {
		this.sesso=sesso;
	}
	public boolean get_sesso() {
		return this.sesso;
	}
	//luogo di nascita
	public String luogo_nascita;
	public void set_birthplace (String luogo_nascita) {
		this.luogo_nascita=luogo_nascita;
	}
	public String get_birthplace() {
		return this.luogo_nascita;
	}
	//nazione di nascita
	public String nazione_nascita;
	public void set_birthstate (String nazione_nascita) {
		this.nazione_nascita=nazione_nascita;
	}
	public String get_birthstate () {
		return this.nazione_nascita;
	}
	//codice fiscale
	public char[] codice_fiscale;
	public void set_codice_fiscale(char[] codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public char[] get_codice_fiscale() {	
		return this.codice_fiscale;
	}

	//voto
	public boolean voto;
	//metodo booleano che permette di controllare se un Elettore abbia già votato per l'evento
	public boolean esprimi_voto (boolean voto) {
		if(voto) return true;
		else {
			return false;
		}
	}
	

}
