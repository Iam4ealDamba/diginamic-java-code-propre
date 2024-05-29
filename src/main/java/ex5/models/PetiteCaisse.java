package ex5.models;

import ex5.enums.Taille;

public class PetiteCaisse extends Caisse {

  public PetiteCaisse() {
    super("Petits objets");
  }

  @Override
  public void addNewItem(Item item) {
    if (item.getPoids() < Taille.PETITE.getTaille()) {
      this.getItems().add(item);
    }
  }
}
