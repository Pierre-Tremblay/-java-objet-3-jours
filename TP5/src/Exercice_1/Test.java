package Exercice_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Nombre nombre = new Nombre();
        int nombreAtrouver1 = nombre.nbAleatoire(100);
        int nombreAtrouver2 = nombre.nbAleatoire(1000);

        boolean finDePartie = false;
        int nombrePropose = 0;
        int nombreDeChance = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de renseigner votre niveau de jeux [1:facile, 2:intermediaire, 3:difficile]");
        int niveau = scanner.nextInt();

        do {

            if (niveau == 1) {
                System.out.println("Proposer un nombre entre 1 et 100");
                nombrePropose = scanner.nextInt();
                if (nombrePropose > nombreAtrouver1) {
                    System.out.println("Merci de renseigner un nombre plus petit");
                } else if (nombrePropose < nombreAtrouver1) {
                    System.out.println("Merci de renseigner un nombre plus grand");
                }
                if (nombrePropose != nombreAtrouver1) {
                    --nombreDeChance;
                    System.out.println("Il vous reste " + nombreDeChance + " essai(s)");
                }
            }
            if (niveau == 2) {
                System.out.println("Proposer un nombre entre 1 et 1000");

                nombrePropose = scanner.nextInt();
                if (nombrePropose > nombreAtrouver2) {
                    System.out.println("Merci de renseigner un nombre plus petit");
                } else if (nombrePropose < nombreAtrouver2) {
                    System.out.println("Merci de renseigner un nombre plus grand");
                }
                if (nombrePropose != nombreAtrouver2) {
                    --nombreDeChance;
                    System.out.println("Il vous reste " + nombreDeChance + " chance(s)");
                }
            }
            if (niveau == 3) {
                System.out.println("Proposer un nombre entre 1 et 1000");
                nombrePropose = scanner.nextInt();
                if (nombrePropose != nombreAtrouver2) {
                    --nombreDeChance;
                    System.out.println("Il vous reste " + nombreDeChance + " chance(s)");
                }
            }

            if (nombrePropose == nombreAtrouver1 || nombrePropose == nombreAtrouver2) {
                System.out.println("Vous avez gagné \n Fin de partie");
                System.out.println("Souhaitez-vous relancer une partie ? [1:Oui, 2:Non]");
                int choix = scanner.nextInt();
                if (choix == 1) {
                    nombreAtrouver1 = nombre.nbAleatoire(100);
                    nombreAtrouver2 = nombre.nbAleatoire(1000);
                    nombreDeChance = 2;
                    nombrePropose = 0;

                } else {
                    finDePartie = true;
                }

            }
            if (nombreDeChance == 0) {
                System.out.println("Vous avez perdu");
                System.out.println("Souhaitez-vous relancer une partie ? [1:Oui, 2:Non]");
                int choix = scanner.nextInt();
                if (choix == 1) {
                    nombreAtrouver1 = nombre.nbAleatoire(100);
                    nombreAtrouver2 = nombre.nbAleatoire(1000);
                    nombreDeChance = 2;
                    nombrePropose = 0;

                } else {
                    finDePartie = true;
                }
            }

        } while (!finDePartie);


        scanner.close();

    }
}
