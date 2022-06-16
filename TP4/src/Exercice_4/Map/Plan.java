package Exercice_4.Map;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private int echelle;
    private String nomFichier;
    private List<Emplacement> lesEmplacements = new ArrayList<>();

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public int getEchelle() {
        return echelle;
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public List<Emplacement> getLesEmplacements() {
        return lesEmplacements;
    }

    public void setLesEmplacements(List<Emplacement> lesEmplacements) {
        this.lesEmplacements = lesEmplacements;
    }
    public void ajouteEmplacement(Emplacement emplacement) {
        this.lesEmplacements.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {
        this.lesEmplacements.remove(emplacement);
    }


    public String affiche() {
         StringBuilder sb = new StringBuilder("Plan{");
        sb.append("echelle=").append(echelle).append('\n');
        sb.append("nomFichier='").append(nomFichier).append('\n');
        for (Emplacement emplacement: this.getLesEmplacements()) {
            sb.append("lesEmplacements=").append(emplacement.affiche()).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}
