package ex3;

import ex3.enums.Comportement;
import ex3.enums.Type;
import ex3.models.Animal;
import ex3.models.Zone;

public class SavaneAfricaine extends Zone {

	public SavaneAfricaine() {
		super(10.0);
	}

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.MAMMIFERE.getType())
				&& animal.getComportement().equals(Comportement.HERBIVORE.getComportement())) {
			this.listeAnimaux.add(animal);
		}
	}
}