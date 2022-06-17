package Exercice_1;

import java.util.Scanner;

public class Partie {
    private final Scanner scanner = new Scanner(System.in);
    private int nombreDeChance = 2;
    private int niveau;
    private boolean finDePartie = false;

    public void demarrerPartie() {
        this.menu();
        this.jouer();
    }

    public void jouer() {
        switch (this.getNiveau()) {
            case 1 -> this.modeFacile();
            case 2 -> this.modeMoyen();
            case 3 -> this.modeDifficile();
            default -> System.out.println("Merci de renseigner votre niveau de jeux [1:facile, 2:intermediaire, 3:difficile]");
        }
    }

    private void modeFacile() {
        Nombre nombreAleatoire = new Nombre(100);
        logicGame(nombreAleatoire);
    }

    private void modeMoyen() {
        Nombre nombreAleatoire = new Nombre(1000);
        logicGame(nombreAleatoire);
    }

    private void modeDifficile() {
        Nombre nombreAleatoire = new Nombre(1000);
        do {
            System.out.println("Proposer un nombre");
            int nombre = scanner.nextInt();
            if (nombre == nombreAleatoire.getNbATrouver()) {
                System.out.println("Bravo ! Tu as gagné !");
                this.setFinDePartie(true);
                this.restartGame();
            } else {
                System.out.println("Raté !Ce n'est pas le bon numéro.");
            }
            nombreDeChance--;
        } while (!finDePartie && nombreDeChance > 0);
        if (this.getNombreDeChance() == 0) {
            System.out.println("Loser! Tu as perdu !");
        }
    }

    private void logicGame(Nombre nombreAleatoire) {
        do {
            System.out.println("Proposer un nombre");
            int nombre = scanner.nextInt();
            if (nombre == nombreAleatoire.getNbATrouver()) {
                System.out.println("Raté !Ce n'est pas le bon numéro.");
                this.setFinDePartie(true);
                this.restartGame();
            } else if (nombre > nombreAleatoire.getNbATrouver()) {
                System.out.println("Merci de renseigner un nombre plus petit");
            } else {
                System.out.println("Merci de renseigner un nombre plus grand");
            }
            nombreDeChance--;
        } while (!this.isFinDePartie() && this.getNombreDeChance() > 0);
        if (this.getNombreDeChance() == 0) {
            System.out.println("Loser! Tu as perdu !");
        }
    }

    private void restartGame() {
        System.out.println("Souhaitez-vous relancer une partie ? [1:Oui, 2:Non]");
        String reponse = scanner.next();
        if (reponse.equals("o")) {
            this.setFinDePartie(false);
            this.setNombreDeChance(10);
            this.jouer();
        } else {
            System.out.println("Fin de partie");
            scanner.close();
        }
    }

    private void menu() {
        System.out.println("Nombre Mystère");
        System.out.println("Vous devez trouver un nombre entre 1 et 100 en 10 essais.");
        System.out.println("Merci de renseigner votre niveau de jeux [1:facile, 2:intermediaire, 3:difficile]");
        this.setNiveau(scanner.nextInt());
    }

    //SETTER && GETTER
    public int getNombreDeChance() {
        return nombreDeChance;
    }

    public void setNombreDeChance(int nombreDeChance) {
        this.nombreDeChance = nombreDeChance;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public boolean isFinDePartie() {
        return finDePartie;
    }

    public void setFinDePartie(boolean finDePartie) {
        this.finDePartie = finDePartie;
    }
}
