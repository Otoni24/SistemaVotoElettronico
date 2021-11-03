package org.barazzottodebiaggi;

public abstract class Voto {

	public Voto() {
		// TODO Auto-generated constructor stub
	}
	public boolean isValid(Voto v) {
		//metodo che permette di controllare se il voto dell'utente sia regolare o, in alternativa, scheda bianca
	}
	public void voting(Utente u) {
		//dopo aver controllato se l'utente abbia già votato o meno in precedenza, il metodo voting fornisce o nega la possiblità di voto al suddetto utente
	}
	public void addToUrna(Urna u) {
		//aggiuge il voto dell'elettore all'Urna(lista di voti)	
	}
								

}
