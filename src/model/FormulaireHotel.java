package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitS;
	private int nbLitD;

	public FormulaireHotel(int jour, int mois, int nbLitS, int nbLitD) {
		super(jour, mois);
		this.nbLitS = nbLitS;
		this.nbLitD = nbLitD;
	}
	public int getJour() {
		return super.getJour();
	}

	public int getMois() {
		return super.getMois();
	}
	
	public int getIdentificationEntite() {
		return super.getNum();
	}
	
	public void setIdentificationEntite(int num) {
		super.setNum(num);
	}
}
