package Exercice_1;

public class Nombre {
    private int nbATrouver;

    public int nbAleatoire(int limit) {
        int nombreATrouver = 0;
        nombreATrouver = (int) (Math.random() * limit);
        System.out.println(nombreATrouver);
        return nombreATrouver;
    }





}
