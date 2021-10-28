package org.barazzottodebiaggi;

public abstract class Utente {

	public Utente() {
		// TODO Auto-generated constructor stub
	}
	public void authentication(Utente u) {
		//il metodo, nel caso in cui la votazione sia a distanza, permette di identificare l'utente
	}
	public boolean isAuthenticated(Utente u) {
		//il metodo restituirà true se l'utente si è precedentemente autenticato o false nel caso non lo abbia ancora fatto
	}
	public void userChoice(Utente u) {
		//il metodo consente all'utente di identificarsi come elettore o scrutatore previa autenticazione
	}

}
