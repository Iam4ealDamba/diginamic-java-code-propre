package ex3;

import ex3.enums.Comportement;
import ex3.enums.Type;
import ex3.models.Animal;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", Type.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", Type.MAMMIFERE, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Type.POISSON, Comportement.CARNIVORE));
		zoo.addAnimal(new Animal("Requin marteau", Type.POISSON, Comportement.HERBIVORE));
		zoo.addAnimal(new Animal("Tortue", Type.REPTILE, Comportement.HERBIVORE));

		zoo.showAnimalList();
	}

}