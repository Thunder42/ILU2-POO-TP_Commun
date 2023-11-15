package model;

public class ReservationHotel extends Reservation{
	private int nbLitS;
	private int nbLitD;
	private int numC;
	
	public ReservationHotel(int jour, int mois, int nbLitS, int nbLitD, int numC) {
		super(jour,mois);
		this.nbLitS = nbLitS;
		this.nbLitD = nbLitD;
		this.numC = numC;
	}
	
	@Override
	public String toString() {
		StringBuilder retour = new StringBuilder("Le "+jour+"/"+mois+" : chambre n° "+numC
				+" avec "+nbLitS+ " lits simples et "+nbLitD+" lits doubles.");
		return retour.toString();
	}
}
