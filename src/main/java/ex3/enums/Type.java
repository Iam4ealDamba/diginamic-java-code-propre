package ex3.enums;

public enum Type {

  MAMMIFERE("Mammifère"), POISSON("Poisson"), REPTILE("Reptile");

  private String type;

  private Type(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}
