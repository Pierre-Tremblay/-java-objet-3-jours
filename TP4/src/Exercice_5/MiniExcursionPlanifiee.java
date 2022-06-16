package Exercice_5;

import java.time.LocalDate;

public class MiniExcursionPlanifiee {
    private LocalDate heureDepart;
    private int nombreInscrits;
    private MiniExcursion miniExcursion;

    public MiniExcursionPlanifiee(LocalDate heureDepart, int nombreInscrits, MiniExcursion miniExcursion) {
        this.heureDepart = heureDepart;
        this.nombreInscrits = nombreInscrits;
        this.miniExcursion = miniExcursion;
    }
    public MiniExcursionPlanifiee(String heureDepart, int nombreInscrits, MiniExcursion miniExcursion) {
        this.heureDepart = LocalDate.now();
        this.nombreInscrits = nombreInscrits;
        this.miniExcursion = miniExcursion;
    }
    public boolean estComplete() {
        return this.nombreInscrits == this.miniExcursion.getNombrePlaces();
    }

    public LocalDate getHeureDepart() {
        return heureDepart;
    }

    public int getNombreInscrits() {
        return nombreInscrits;
    }

    public MiniExcursion getMiniExcursion() {
        return miniExcursion;
    }

    public void setHeureDepart(LocalDate heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setNombreInscrits(int nombreInscrits) {
        this.nombreInscrits = nombreInscrits;
    }

    public void setMiniExcursion(MiniExcursion miniExcursion) {
        this.miniExcursion = miniExcursion;
    }
}
