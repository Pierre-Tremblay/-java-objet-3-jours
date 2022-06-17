public class Carre implements ProprieteGeo {
    private double cote;


    public Carre(double cote) {
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }


    @Override
    public double aire() {
        return getCote() * getCote();

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Forme : Carré ");
        sb.append("[coté=").append(cote).append("] ");
        sb.append("Aire=").append(aire());
        return sb.toString();
    }
}
