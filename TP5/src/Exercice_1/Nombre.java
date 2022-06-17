package Exercice_1;

public class Nombre {
    private int nbATrouver;

    public Nombre(int limit) {
        this.nbATrouver = (int) (Math.random() * limit);
    }

    public int getNbATrouver() {
        return nbATrouver;
    }
}
