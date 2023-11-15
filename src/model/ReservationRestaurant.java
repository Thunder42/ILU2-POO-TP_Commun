package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		StringBuilder retour = new StringBuilder("Le "+jour+"/"+mois+"\nTable "+numTable
				+" pour le ");
		if (numService == 1)
			retour.append("premier service.");
		else
			retour.append("deuxième service.");
		return retour.toString();
	}

}
