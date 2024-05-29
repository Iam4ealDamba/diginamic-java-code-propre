package ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import ex3.models.Animal;
import ex3.models.Zone;

public class Zoo {
	/** Nom du Zoo */
	private String nom;
	private ArrayList<Zone> listeZones;

	/**
	 * Constructeur
	 * 
	 * @param nom - nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		this.listeZones = new ArrayList<>(
				Arrays.asList(new SavaneAfricaine(), new ZoneCarnivore(), new FermeReptile(), new Aquarium()));
	}

	/**
	 * Ajoute un animal au zoo
	 * 
	 * @param nomAnimal    - nom de l'animal
	 * @param typeAnimal   - type de l'animal
	 * @param comportement - comportement de l'animal
	 */
	public void addAnimal(Animal animal) {
		for (int index = 0; index < listeZones.size(); index++) {
			listeZones.get(index).addAnimal(animal);
		}
	}

	/**
	 * A method to display the list of animals in the zoo.
	 */
	public void showAnimalList() {
		HashMap<String, ArrayList<Animal>> map = new HashMap<>();

		for (int i = 0; i < listeZones.size(); i++) {
			map.put(listeZones.get(i).getClass().getSimpleName(), listeZones.get(i).afficherListeAnimaux());
		}

		System.out.println("Liste des animaux : {");
		map.forEach((key, value) -> {
			System.out.println(key + " : [");
			for (Animal animal : value) {
				System.out
						.println("\t{ " + animal.getNom() + " : " + animal.getType() + " - " + animal.getComportement() + " },");
			}
			System.out.println("]");
		});
		System.out.println("}");
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter for nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}