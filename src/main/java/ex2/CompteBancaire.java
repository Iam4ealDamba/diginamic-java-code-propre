package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A
 * (type=LA)
 * 
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;

	/**
	 * Constructeur
	 * 
	 * @param type             - compte courant (CC) ou livret A (LA)
	 * @param solde            - solde du compte
	 * @param decouvert        - decouvert autorisé pour les comptes courants
	 * @param tauxRemuneration - taux de rémuneration dans le cas d'un livret A
	 */
	public CompteBancaire(double solde, Double decouvert, Double tauxRemuneration) {
		this.type = "CC";
		this.solde = solde;
		this.decouvert = decouvert == null ? 0 : decouvert;
		this.tauxRemuneration = tauxRemuneration == null ? 0 : tauxRemuneration;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Reduire un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (type.equals("CC")) {
			if (this.solde - montant > decouvert) {
				this.solde = solde - montant;
			}
		} else if (type.equals("LA")) {
			if (this.solde - montant > 0) {
				this.solde = solde - montant;
			}
		}
	}

	/**
	 * Retourne le solde
	 * 
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Modifie le solde
	 * 
	 * @param solde le nouveau solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Retourne le decouvert
	 * 
	 * @return le decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Modifie le decouvert
	 * 
	 * @param decouvert le nouveau decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/**
	 * Retourne le taux de rémuneration
	 * 
	 * @return le taux de rémuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Modifie le taux de rémuneration
	 * 
	 * @param tauxRemuneration le nouveau taux de rémuneration
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Retourne le type
	 * 
	 * @return le type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Modifie le type
	 * 
	 * @param type le nouveau type
	 */
	public void setType(String type) {
		this.type = type;
	}
}
