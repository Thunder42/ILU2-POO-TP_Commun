package model;

public class EntiteReservable <F extends Formulaire> {
	private CalendrierAnnuel calendrierP;
	private int num;

	public EntiteReservable(CalendrierAnnuel calendrierP) {
		this.calendrierP = calendrierP;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean estLibre(F formulaire) {
		int jour = formulaire.getJour();
		int mois = formulaire.getMois();
		return calendrierP.estLibre(jour, mois);
	}
}
