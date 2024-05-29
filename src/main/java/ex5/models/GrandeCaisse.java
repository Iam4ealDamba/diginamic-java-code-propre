package ex5.models;

import ex5.models.Caisse;
import ex5.enums.Taille;

public class GrandeCaisse extends Caisse {

  public GrandeCaisse() {
    super("Grands objets");
  }

  @Override
  public void addNewItem(Item item) {
    if (item.getPoids() >= Taille.GRANDE.getTaille()) {
      this.getItems().add(item);
    }
  }
}
