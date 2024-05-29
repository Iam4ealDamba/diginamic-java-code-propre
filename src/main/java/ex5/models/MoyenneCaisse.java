package ex5.models;

import ex5.models.Caisse;
import ex5.enums.Taille;

public class MoyenneCaisse extends Caisse {

  public MoyenneCaisse() {
    super("Moyens objets");
  }

  @Override
  public void addNewItem(Item item) {
    if (item.getPoids() >= Taille.PETITE.getTaille() && item.getPoids() <= Taille.GRANDE.getTaille()) {
      this.getItems().add(item);
    }
  }
}
