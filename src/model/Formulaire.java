package model;

public abstract class Formulaire {
	protected int jour;
	protected int mois;
	protected int num = 0;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

}
