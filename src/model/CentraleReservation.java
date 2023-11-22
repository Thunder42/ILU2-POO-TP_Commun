package model;

public class CentraleReservation <E extends EntiteReservable, F extends Formulaire>{

	private E[] entites;
	private int nbE;
	
	public CentraleReservation(E[] entites) {
		this.entites = entites;
	}
	
	public int ajouterEntite(E entite) {
		entites[nbE] = entite;
		nbE++;
		int n =entite.getNum()+1;
		entite.setNum(n);
		return n;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int[] possibilites = new int[entites.length];
		for (int i=0; i < possibilites.length; i++) {
			if (entites[i].estLibre(formulaire)) {
				possibilites[i] = 1;
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}
	
	public Reservation reserver(int numE, F formulaire){
		E entite = entites[numE];
		formulaire.setNum(entite.getNum());
		return E.reserver(formulaire);
	}

}
