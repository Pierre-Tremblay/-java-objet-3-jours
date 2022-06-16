package Exercice_4.Map;

public class Terrasse extends Emplacement {
    public Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
        StringBuilder sb = new StringBuilder("Terrasse{");
        sb.append("Couleur ='").append(this.getCouleur());
        sb.append(", xCentre='").append(this.getxCentre());
        sb.append(", yCentre='").append(this.getyCentre());
        sb.append('}');
        return sb.toString();
    }


}
