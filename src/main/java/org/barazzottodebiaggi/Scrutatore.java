package org.barazzottodebiaggi;

public class Scrutatore extends Utente {

	public Scrutatore() {
		// TODO Auto-generated constructor stub		
	}
	public boolean isClosed() {
		//controlla che le votazioni siano aperte o chiuse per quell'evento
	}
	public void closing(boolean flag) {
		//lo scrutatore chiude le votazione per l'evento in considerazione
	}
	public int voteCount(Urna u) {
		//dopo aver ricevuto in input un'Urna(lista di voti), il metodo calcola, dopo la chiusura delle votazioni, e restituisce il candidato/lista/partito/gruppo che ha ricevuto più voti
	}
	public Lista hasWon(int res) {
		//ricevendo il risultato del conteggio, il metodo riporta sia la lista/partito/gruppo vincitore, sia specifica se la vittoria è per maggioranza o per maggioranza assoluta
	}
	public Lista hasWonReferendum(int ref) {
		//il metodo, dopo avere verificato se il referendum ha o meno un quorum da raggiungere, comunica il vincitore e la modalità di vittoria(con o senza quorum)
	}

}
