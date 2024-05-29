package ex2;

public class LivretA extends CompteBancaire {

	/**
	 * Constructeur
	 * 
	 * @param solde            - solde : solde du compte
	 * @param tauxRemuneration - tauxRemuneration : taux de rémunération dans le cas
	 *                         d'un livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, null, tauxRemuneration);
		this.type = "LA";
	}

	/** Calcule la régularisation du Livret A */
	public void appliquerRemuAnnuelle() {
		this.setSolde(this.getSolde() + this.getSolde() * this.getTauxRemuneration() / 100);
	}
}
