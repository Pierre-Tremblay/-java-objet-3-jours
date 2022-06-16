package Map;

public class Etalage extends Emplacement {
    public Etalage(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    public String affiche() {
         StringBuilder sb = new StringBuilder("Etalage{");
        sb.append("Couleur ='").append(this.getCouleur());
        sb.append(", xCentre='").append(this.getxCentre());
        sb.append(", yCentre='").append(this.getyCentre());
        sb.append('}');
        return sb.toString();
    }


}
