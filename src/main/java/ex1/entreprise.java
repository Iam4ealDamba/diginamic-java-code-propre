package ex1;

import java.util.Date;

public class Entreprise {
	/** Siret de l'entreprise */
	public int siret;
	/** Nom de l'entreprise */
	public String nom;
	/** Adresse de l'entreprise */
	public String adresse;
	/** Date de creation */
	public Date dateCreation;
	/** Capital max de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Constructeur
	 * 
	 * @param siret        - siret de l'entreprise
	 * @param nom          - nom de l'entreprise
	 * @param adresse      - adresse de l'entreprise
	 * @param dateCreation - date de creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}
}
