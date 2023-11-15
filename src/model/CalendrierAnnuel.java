package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Février",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Août",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octobre",31);
		calendrier[10] = new Mois("Novembre",30);
		calendrier[11] = new Mois("Décembre",31);
	}
	
	//ces méthodes prennent les indices humains (de 1 à 12, de 1 à 29, ...)
	public boolean estLibre(int inJour, int inMois) {
		if (0 < inMois && inMois <= 12)
			return (calendrier[inMois-1]).estLibre(inJour-1);
		else
			System.out.println("L'indice du mois n'est pas valide.");
			return false;
	}
	
	public boolean reserver(int inJour, int inMois) {
		if (0 < inMois && inMois <= 12) {
			try {
				calendrier[inMois-1].reserver(inJour-1);
			} catch(IllegalStateException e) {
				System.out.println("La réservation n'a pas été effectué");
				return false;
			}
			return true;
		}else {
			System.out.println("L'indice du mois n'est pas valide.");
			return false;
		}
	}
	
	public class Mois {
		private String nom;
		private boolean[] jours;
		//true = réservation ce jour 
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			for (int i=0; i < nbJours; i++)
				jours[i] = false;
		}
		
		//ces méthodes prennent les indices informatiques (de 0 à 11, de 0 à 28,...)
		private boolean estLibre(int inJour) {
			if (0 <= inJour && inJour < jours.length) {
				return !jours[inJour];
			}
			System.out.println("L'indice du jour n'est pas valide.");
			return false;
		}
		
		private void reserver(int inJour) throws IllegalStateException {
			if (0 <= inJour && inJour < jours.length && estLibre(inJour)) {
				jours[inJour] = true;
			} else {
				throw new IllegalStateException("L'indice du jour n'est pas valide ou "
						+ "ce jour de réservation n'est pas libre.");
			}
		}
	}
}
