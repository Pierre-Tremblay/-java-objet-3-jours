public class Rectangle implements ProprieteGeo{

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double aire() {
        double aireRectangle;
        return aireRectangle = (getLargeur() * getLongueur());
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Forme : Carré ");
        sb.append("[longueur=").append(longueur).append(", ");
        sb.append("largeur=").append(largeur).append("] ");
        sb.append("Aire=").append(aire());
        return sb.toString();
    }
}
