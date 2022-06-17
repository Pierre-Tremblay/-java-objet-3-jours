import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ProprieteGeo> figures = new ArrayList<>();
        Boolean poursuivre = true;
        do {
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");
            String figure = scanner.nextLine().toLowerCase();

            switch (figure) {
                case "triangle" -> {
                    System.out.println("Quelle est la longueur de la base ?");
                    double base = scanner.nextDouble();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    double hauteur = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, hauteur);
                    figures.add(triangle);
                }
                case "carré" -> {
                    System.out.println("Quelle est la longueur du coté ?");
                    double cote = scanner.nextDouble();
                    Carre carre = new Carre(cote);
                    figures.add(carre);
                }
                case "rectangle" -> {
                    System.out.println("Quelle est la longueur du rectangle ?");
                    double longueur = scanner.nextDouble();
                    System.out.println("Quelle est la largueur du rectangle ?");
                    double largueur = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(longueur, largueur);
                    figures.add(rectangle);
                }
                case "cercle" -> {
                    System.out.println("Quelle est la rayon du cercle ?");
                    double rayon = scanner.nextDouble();
                    Cercle cercle = new Cercle(rayon);
                    figures.add(cercle);
                }
                case "losange" -> {
                    System.out.println("Quelle est la plus petite diagonale du losange ?");
                    double diagonale1 = scanner.nextDouble();
                    System.out.println("Quelle est la plus grande diagonale du losange ?");
                    double diagonale2 = scanner.nextDouble();
                    Losange losange = new Losange(diagonale1, diagonale2);
                    figures.add(losange);
                }

            }
            System.out.println("Une autre forme (oui/non) ?");
            scanner.nextLine();
            String suite = scanner.nextLine();
            if (suite.equals("non")) {
                poursuivre = false;

            }
        } while (poursuivre);
        for (ProprieteGeo figure : figures
        ) {
            System.out.println(figure);
        }

    }

}
