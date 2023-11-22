package model;

public class FormulaireSpectacle extends Formulaire {
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois,int numZone) {
		super(jour, mois);
		this.numZone = numZone;
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
