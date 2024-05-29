package ex3.models;

import ex3.enums.Comportement;
import ex3.enums.Type;

public class Animal {
  private String nom;
  private Type type;
  private Comportement comportement;

  public Animal(String nom, Type type, Comportement comportement) {
    this.nom = nom;
    this.type = type;
    this.comportement = comportement;
  }

  public String getNom() {
    return nom;
  }

  public String getType() {
    return type.getType();
  }

  public String getComportement() {
    return comportement.getComportement();
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @Override
  public String toString() {
    return "Animal [nom=" + this.getNom() + ", type=" + this.getType() + ", comportement=" + this.getComportement()
        + "]";
  }

}
