package model;

public class Restaurant {
	
	public void ajouterTable(int nbChaises) {
		
	}
	
	public int[] donnerPossibilitees(FormulaireRestaurant formulaire) {
		
	}
	
	public Reservation reserver(int numE, FormulaireRestaurant formulaire) {
		
	}
	
	public class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel deuxiemeService;
		
		public Table(CalendrierAnnuel calendrierP, int nbChaises, CalendrierAnnuel deuxiemeService) {
			super(calendrierP);
			this.nbChaises = nbChaises;
			this.deuxiemeService = deuxiemeService;
		}
		
		public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
			if (compatible(formulaireRestaurant)) {
				
			}
		}
		
		public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
			boolean place = (nbChaises >= formulaireRestaurant.getNombrePersonnes());
			int numService = formulaireRestaurant.getNumService();
			boolean libre;
			if (numService == 1) {
				libre = super.estLibre(formulaireRestaurant);
			} else {
				int jour = formulaireRestaurant.getJour();
				int mois = formulaireRestaurant.getMois();
				libre = deuxiemeService.estLibre(jour, mois);
			}
			return place && libre;
		}
	}
}

