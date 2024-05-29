package ex5.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new PetiteCaisse());
		caisses.add(new MoyenneCaisse());
		caisses.add(new GrandeCaisse());
	}

	public void addItem(Item item) {
		for (int i = 0; i < caisses.size(); i++) {
			caisses.get(i).addNewItem(item);
		}
	}

	public void taille() {
		HashMap<String, Integer> map = new HashMap<>();
		for (Caisse caisse : caisses) {
			map.put(caisse.getNom(), caisse.getItems().size());
		}

		System.out.println("Taille inventaire : {");
		map.forEach((key, value) -> System.out.println(key + " : " + value + ","));
		System.out.println("}");
	}
}
