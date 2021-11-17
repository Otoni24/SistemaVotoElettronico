package org.barazzottodebiaggi;

import java.util.Date;

public class Elettore extends Utente {

	public Elettore() {
		// TODO Auto-generated constructor stub
	}
	
	
	//attributi
	public /*@ non_null @*/ String nome;
	public /*@ non_null @*/ String cognome;
	public Date data_nascita;
	//@ invariant sesso == 'M' || sesso =='F';
	public char sesso;
	public String luogo_nascita;
	public String nazione_nascita;
	public char[] codice_fiscale;
	public boolean voto;
	
	//metodi
	//nome
	public void set_Nome (String nome) {
		this.nome=nome;
	}
	public String get_Nome() {
		return this.nome;
	}
	//cognome
	public void set_Cognome (String cognome) {
		this.cognome=cognome;
	}
	public String get_Cognome() {
		return this.cognome;
	}
	//data di nascita
	public void set_data_nascita(Date data_nascita) throws ParseException {
		this.data_nascita = data_nascita;
	}
	//@ invariant Date.after(this.data_nascita) == false;
	public Date get_data_nascita() {
		return this.data_nascita;	
	}
	//sesso
	public void set_sesso (char sesso) {
		this.sesso=sesso;
	}
	public char get_sesso() {
		return this.sesso;
	}
	//luogo di nascita
	public void set_birthplace (String luogo_nascita) {
		this.luogo_nascita=luogo_nascita;
	}
	public String get_birthplace() {
		return this.luogo_nascita;
	}
	//nazione di nascita
	public void set_birthstate (String nazione_nascita) {
		this.nazione_nascita=nazione_nascita;
	}
	//@ invariant nazione_nascita=="Italia"; requires luogo_nascita != null;
	public String get_birthstate () {
		return this.nazione_nascita;
	}
	//codice fiscale
	public void set_codice_fiscale(char[] codice_fiscale) {
		this.codice_fiscale = codice_fiscale;
	}
	public char[] get_codice_fiscale() {	
		return this.codice_fiscale;
	}

	//voto
	//metodo booleano che permette di controllare se un Elettore abbia già votato per l'evento
	public /*@ pure @*/ boolean esprimi_voto (boolean voto) {
		if(voto) return true;
		else {
			return false;
		}
	}
	//@ ensures esprimi_voto(voto) == voto;

}
