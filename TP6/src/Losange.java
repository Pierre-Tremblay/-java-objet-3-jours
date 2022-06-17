public class Losange implements ProprieteGeo {
    private double diagonale1;
    private double diagonale2;

    public Losange(double diagonale1, double diagonale2) {
        this.diagonale1 = diagonale1;
        this.diagonale2 = diagonale2;
    }

    public double getDiagonale1() {
        return diagonale1;
    }

    public void setDiagonale1(double diagonale1) {
        this.diagonale1 = diagonale1;
    }

    public double getDiagonale2() {
        return diagonale2;
    }

    public void setDiagonale2(double diagonale2) {
        this.diagonale2 = diagonale2;
    }


    @Override
    public double aire() {

        return ((getDiagonale1() * getDiagonale2()) / 2);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Forme : Carré ");
        sb.append("[base=").append(diagonale1).append(", ");
        sb.append("hauteur=").append(diagonale2).append("] ");
        sb.append("Aire=").append(aire());
        return sb.toString();
    }
}
