package org.barazzottodebiaggi;

public class Urna {

	public Urna() {
		// TODO Auto-generated constructor stub
	}
	public boolean isClosed() {
		//controlla che le votazioni siano aperte o chiuse per quell'evento
	}
	public void randomization(Urna u) {
		//il metodo randomizza la posizione dei voti all'interno della lista in modo da rendere impossibile il rintracciamento dell'utente tramite il proprio voto
	}
	public int voteCount(Urna u) {
		//dopo aver ricevuto in input un'Urna(lista di voti), il metodo calcola, dopo la chiusura delle votazioni, e restituisce il candidato/lista/partito/gruppo che ha ricevuto più voti
	}
	public Lista hasWon(int res) {
		//ricevendo il risultato del conteggio, il metodo riporta sia la lista/partito/gruppo vincitore, sia specifica se la vittoria è per maggioranza o per maggioranza assoluta
	}

}
