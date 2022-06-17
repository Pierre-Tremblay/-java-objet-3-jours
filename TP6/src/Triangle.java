public class Triangle implements ProprieteGeo {
    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public double aire() {
        double aireTriangle;
        return aireTriangle = (getHauteur() * getBase()) / 2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Forme : Carré ");
        sb.append("[base=").append(base).append(", ");
        sb.append("hauteur=").append(hauteur).append("] ");
        sb.append("Aire=").append(aire());
        return sb.toString();
    }
}
