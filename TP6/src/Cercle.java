public class Cercle implements ProprieteGeo{
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }



    @Override
    public double aire() {
        return ((getRayon() * getRayon()) * Math.PI);
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Forme : Carré ");
        sb.append("[rayon=").append(rayon).append("] ");
        sb.append("Aire=").append(aire());
        return sb.toString();
    }
}
