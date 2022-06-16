package Exercice_5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    private int numMiniExcursion;
    private String libelleMiniExcursion;
    private int nombrePlaces;
    private List<Etape> lesEtapes = new ArrayList<>();
    protected int numeroExcursion = lesEtapes.size();

    public MiniExcursion(String libelleExcursion, int nombrePlace, List<Etape> lesEtapes) {
        this.setLibelleMiniExcursion(libelleExcursion);
        this.setNombrePlaces(nombrePlace);
        this.setLesEtapes(lesEtapes);
    }

    public List<Etape> getLesEtapes() {
        return lesEtapes;
    }

    public void setLesEtapes(List<Etape> lesEtapes) {
        this.lesEtapes = lesEtapes;
    }

    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public void setNumMiniExcursion(int numMiniExcursion) {
        this.numMiniExcursion = numMiniExcursion;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public void setLibelleMiniExcursion(String libelleExcursion) {
        this.libelleMiniExcursion = libelleExcursion;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlace) {
        this.nombrePlaces = nombrePlace;
    }

    public void ajouteEtape(Etape uneEtape) {
        lesEtapes.add(uneEtape);
    }

    public int donneDureePrevue() {
        int donnee = 0;
        for (Etape lesEtape : lesEtapes) {
            donnee = Integer.parseInt(lesEtape.donneeDureePrevueHHMM().format(DateTimeFormatter.ofPattern("MM")));
        }
        return donnee;
    }

    public LocalTime donneDureePrevueHHMM() {
        int duree = 0;
        for (Etape etape : lesEtapes) {
            duree += etape.getDureePrevue();
        }
        return LocalTime.ofSecondOfDay(duree * 60L);
    }

}
