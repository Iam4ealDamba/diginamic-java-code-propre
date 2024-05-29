package ex5.enums;

public enum Taille {

  PETITE(5), GRANDE(20);

  private final int taille;

  private Taille(int taille) {
    this.taille = taille;
  }

  public int getTaille() {
    return taille;
  }
}
