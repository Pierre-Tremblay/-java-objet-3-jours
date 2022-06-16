package Exercice_5;

import java.time.LocalTime;

public class Etape  {
    private int numEtape;
    private String descriptionPrevue;
    private int dureePrevue;
    private int totalEtape;

    public Etape(String descriptionPrevue, int dureePrevue) {
        this.descriptionPrevue = descriptionPrevue;
        this.dureePrevue = dureePrevue;

    }

    public int getNumEtape() {
        return numEtape;
    }

    public void setNumEtape(int numEtape) {
        this.numEtape = numEtape;
    }

    public String getDescriptionPrevue() {
        return descriptionPrevue;
    }

    public void setDescription(String description) {
        this.descriptionPrevue = description;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public LocalTime donneeDureePrevueHHMM() {
        return LocalTime.ofSecondOfDay(dureePrevue * 60L);
    }
}
