package ex3.enums;

public enum Comportement {

  CARNIVORE("Carnivore"), HERBIVORE("Herbivore");

  private String comportement;

  private Comportement(String comportement) {
    this.comportement = comportement;
  }

  public String getComportement() {
    return this.comportement;
  }
}
