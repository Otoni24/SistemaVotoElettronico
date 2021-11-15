package org.barazzottodebiaggi;

public class Elettore extends Utente {

	public Elettore() {
		// TODO Auto-generated constructor stub
	}
	//attributi e rispettivi metodi set e get
	
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
	public boolean return get_sesso() {
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
	public String codice_fiscale;
	public void codice_fiscale() {
		String codice_fiscale1 = "";
		String cognome = this.cognome;
		String nome = this.nome;
		String annoNascita = String.valueOf(this.anno_nascita); //convertire int a stringa;
		String meseNascita=String.valueOf(this.mese_nascita);; //convertire int a stringa
		String giornoNascita=String.valueOf(this.giorno_nascita);; //convertire int a stringa
		String luogoNascita = this.luogo_nascita;
		//calcolo prime 3 lettere
		int cont = 0;
		//caso cognome minore di 3 lettere
		if (cognome.length()<3){
			codice_fiscale1+= cognome;
		while (codice_fiscale1.length()<3) codice_fiscale1+= "X";
			cont=3;
		}
		//caso normale
		for (int i=0;i<cognome.length();i++) {
			if (cont==3) break;
			if (cognome.charAt(i)!='A' && cognome.charAt(i)!='E' && cognome.charAt(i)!='I' && cognome.charAt(i)!='O' && cognome.charAt(i)!='U') {
				codice_fiscale1+= Character.toString(cognome.charAt(i));
				cont++;
			}
		}
		//nel caso ci siano meno di 3 consonanti
		while (cont<3) {
			for (int i=0;i<cognome.length();i++) {
				if (cont==3) break;
				if (cognome.charAt(i)=='A' || cognome.charAt(i)=='E' || cognome.charAt(i)=='I' || cognome.charAt(i)=='O' || cognome.charAt(i)=='U') {
					codice_fiscale1+= Character.toString(cognome.charAt(i));
					cont++;
				}
			}
		}
		//lettere nome
		cont = 0;
		//caso nome minore di 3 lettere
		if (nome.length()<3){
			codice_fiscale1+= nome;
			while (codice_fiscale1.length()<6) codice_fiscale1+= "X";
				cont=3;
		}
		//caso normale
		for (int i=0;i<nome.length();i++) {
			if (cont==3) break;
			if (nome.charAt(i)!='A' && nome.charAt(i)!='E' && nome.charAt(i)!='I' && nome.charAt(i)!='O' && nome.charAt(i)!='U') {
				codice_fiscale1+= Character.toString(nome.charAt(i));
				cont++;
			}
		}
		//nel casoci siano meno di 3 consonanti
		while (cont<3) {
			for (int i=0;i<nome.length();i++) {
				if (cont==3) break;
				if (nome.charAt(i)=='A' || nome.charAt(i)=='E' || nome.charAt(i)=='I' || nome.charAt(i)=='O' || nome.charAt(i)=='U') {
				codice_fiscale1+= Character.toString(nome.charAt(i));
				cont++;
				}
			}
		}
		//anno di nascita
		String anno= String.valueOf(annoNascita);
		codice_fiscale1+=anno.substring(2,4);
		//mese di nascita
		int mese=0;
		if (meseNascita.charAt(3)== '0') mese = Integer.parseInt(meseNascita.substring(4,5));
		else mese = Integer.parseInt(meseNascita.substring(3,5));
		switch (mese) {
		case 1: {codice_fiscale1+="A";break;}
		case 2: {codice_fiscale1+="B";break;}
		case 3: {codice_fiscale1+="C";break;}
		case 4: {codice_fiscale1+="D";break;}
		case 5: {codice_fiscale1+="E";break;}
		case 6: {codice_fiscale1+="H";break;}
		case 7: {codice_fiscale1+="L";break;}
		case 8: {codice_fiscale1+="M";break;}
		case 9: {codice_fiscale1+="P";break;}
		case 10: {codice_fiscale1+="R";break;}
		case 11: {codice_fiscale1+="S";break;}
		case 12: {codice_fiscale1+="T";break;}
		}
		//giorno di nascita
		int giorno=0;
		if (giornoNascita.charAt(0)== '0') giorno = Integer.parseInt(giornoNascita.substring(0,1));
		else giorno = Integer.parseInt(giornoNascita.substring(0,2));
		if (sesso) codice_fiscale1+= giorno;
		else {
			giorno+=40;
			codice_fiscale1+=Integer.toString(giorno);
		}
		//comune
		                    //??? come faccio a scegliere numero e lettere del comune ???
		//carattere di controllo
		int sommaPari=0;
		for (int i=1;i<=13;i+=2) {
		switch (codice_fiscale1.charAt(i)) {
			case '0': {sommaPari+=0;break;}
			case '1': {sommaPari+=1;break;}
			case '2': {sommaPari+=2;break;}
			case '3': {sommaPari+=3;break;}
			case '4': {sommaPari+=4;break;}
			case '5': {sommaPari+=5;break;}
			case '6': {sommaPari+=6;break;}
			case '7': {sommaPari+=7;break;}
			case '8': {sommaPari+=8;break;}
			case '9': {sommaPari+=9;break;}
			case 'A': {sommaPari+=0;break;}
			case 'B': {sommaPari+=1;break;}
			case 'C': {sommaPari+=2;break;}
			case 'D': {sommaPari+=3;break;}
			case 'E': {sommaPari+=4;break;}
			case 'F': {sommaPari+=5;break;}
			case 'G': {sommaPari+=6;break;}
			case 'H': {sommaPari+=7;break;}
			case 'I': {sommaPari+=8;break;}
			case 'J': {sommaPari+=9;break;}
			case 'K': {sommaPari+=10;break;}
			case 'L': {sommaPari+=11;break;}
			case 'M': {sommaPari+=12;break;}
			case 'N': {sommaPari+=13;break;}
			case 'O': {sommaPari+=14;break;}
			case 'P': {sommaPari+=15;break;}
			case 'Q': {sommaPari+=16;break;}
			case 'R': {sommaPari+=17;break;}
			case 'S': {sommaPari+=18;break;}
			case 'T': {sommaPari+=19;break;}
			case 'U': {sommaPari+=20;break;}
			case 'V': {sommaPari+=21;break;}
			case 'W': {sommaPari+=22;break;}
			case 'X': {sommaPari+=23;break;}
			case 'Y': {sommaPari+=24;break;}
			case 'Z': {sommaPari+=25;break;}
		}
		}
		int sommaDispari=0;
		for (int i=0;i<=14;i+=2) {
		switch (codice_fiscale1.charAt(i)) {
			case '0': {sommaDispari+=1;break;}
			case '1': {sommaDispari+=0;break;}
			case '2': {sommaDispari+=5;break;}
			case '3': {sommaDispari+=7;break;}
			case '4': {sommaDispari+=9;break;}
			case '5': {sommaDispari+=13;break;}
			case '6': {sommaDispari+=15;break;}
			case '7': {sommaDispari+=17;break;}
			case '8': {sommaDispari+=19;break;}
			case '9': {sommaDispari+=21;break;}
			case 'A': {sommaDispari+=1;break;}
			case 'B': {sommaDispari+=0;break;}
			case 'C': {sommaDispari+=5;break;}
			case 'D': {sommaDispari+=7;break;}
			case 'E': {sommaDispari+=9;break;}
			case 'F': {sommaDispari+=13;break;}
			case 'G': {sommaDispari+=15;break;}
			case 'H': {sommaDispari+=17;break;}
			case 'I': {sommaDispari+=19;break;}
			case 'J': {sommaDispari+=21;break;}
			case 'K': {sommaDispari+=2;break;}
			case 'L': {sommaDispari+=4;break;}
			case 'M': {sommaDispari+=18;break;}
			case 'N': {sommaDispari+=20;break;}
			case 'O': {sommaDispari+=11;break;}
			case 'P': {sommaDispari+=3;break;}
			case 'Q': {sommaDispari+=6;break;}
			case 'R': {sommaDispari+=8;break;}
			case 'S': {sommaDispari+=12;break;}
			case 'T': {sommaDispari+=14;break;}
			case 'U': {sommaDispari+=16;break;}
			case 'V': {sommaDispari+=10;break;}
			case 'W': {sommaDispari+=22;break;}
			case 'X': {sommaDispari+=25;break;}
			case 'Y': {sommaDispari+=24;break;}
			case 'Z': {sommaDispari+=23;break;}
		}
		}
		int interoControllo = (sommaPari+sommaDispari)%26;
		String carattereControllo="";
		switch (interoControllo) {
			case 0:{carattereControllo="A";break;}
			case 1:{carattereControllo="B";break;}
			case 2:{carattereControllo="C";break;}
			case 3:{carattereControllo="D";break;}
			case 4:{carattereControllo="E";break;}
			case 5:{carattereControllo="F";break;}
			case 6:{carattereControllo="G";break;}
			case 7:{carattereControllo="H";break;}
			case 8:{carattereControllo="I";break;}
			case 9:{carattereControllo="J";break;}
			case 10:{carattereControllo="K";break;}
			case 11:{carattereControllo="L";break;}
			case 12:{carattereControllo="M";break;}
			case 13:{carattereControllo="N";break;}
			case 14:{carattereControllo="O";break;}
			case 15:{carattereControllo="P";break;}
			case 16:{carattereControllo="Q";break;}
			case 17:{carattereControllo="R";break;}
			case 18:{carattereControllo="S";break;}
			case 19:{carattereControllo="T";break;}
			case 20:{carattereControllo="U";break;}
			case 21:{carattereControllo="V";break;}
			case 22:{carattereControllo="W";break;}
			case 23:{carattereControllo="X";break;}
			case 24:{carattereControllo="Y";break;}
			case 25:{carattereControllo="Z";break;}
		}
		codice_fiscale1+=carattereControllo;
		this.codice_fiscale=codice_fiscale1;
	}
	public String get_codice_fiscale() {	
		return this.codice_fiscale;
	}

	//voto
	public boolean voto;
	public boolean esprimi_voto (boolean voto) {
		//metodo booleano che permette di controllare se un Elettore abbia già votato per l'evento
		if(voto) return true;
		else {
			return false;
		}
	}
	

}
