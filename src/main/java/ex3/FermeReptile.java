package ex3;

import java.util.List;

import ex3.enums.Type;
import ex3.models.Animal;
import ex3.models.Zone;

public class FermeReptile extends Zone {

	public FermeReptile() {
		super(10.0);
	}

	@Override
	public void addAnimal(Animal animal) {
		if (animal.getType().equals(Type.REPTILE.getType())) {
			this.listeAnimaux.add(animal);
		}
	}

}