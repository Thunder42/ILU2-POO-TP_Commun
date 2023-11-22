package model;

public class FormulaireRestaurant extends Formulaire {
	private int numService;
	private int nbPersonnes;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(jour, mois);
		this.nbPersonnes = nbPersonnes;
		this.numService = numService;
	}
	
	public int getJour() {
		return super.getJour();
	}

	public int getMois() {
		return super.getMois();
	}

	public int getNumService() {
		return numService;
	}

	public int getNombrePersonnes() {
		return nbPersonnes;
	}
	
	public int getIdentificationEntite() {
		return super.getNum();
	}
	
	public void setIdentificationEntite(int num) {
		super.setNum(num);
	}
}
