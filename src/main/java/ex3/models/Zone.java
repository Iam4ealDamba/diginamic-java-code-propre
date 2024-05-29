package ex3.models;

import java.util.ArrayList;

public abstract class Zone {
  protected ArrayList<Animal> listeAnimaux;
  private double poidsConsoMoyenne;

  public Zone(double poidsConsoMoyenne) {
    this.poidsConsoMoyenne = poidsConsoMoyenne;
    this.listeAnimaux = new ArrayList<>();
  }

  public void addAnimal(Animal animal) {
    listeAnimaux.add(animal);
  }

  public ArrayList<Animal> afficherListeAnimaux() {
    return this.listeAnimaux;
  }

  public int compterAnimaux() {
    return listeAnimaux.size();
  }

  public int calculerKgsNourritureParJour() {
    return listeAnimaux.size() * (int) this.poidsConsoMoyenne;
  }
}
