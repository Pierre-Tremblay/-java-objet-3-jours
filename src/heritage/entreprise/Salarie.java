package src.heritage.entreprise;

public class Salarie extends Individu {
    private int salaire;

    public Salarie(String prenom, String nom, int salaire) {
        super(prenom, nom);
        this.salaire = salaire;
    }

    public Salarie(int salaire) {
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return super.toString()+", salaire=" + getSalaire()+"€/mois";
    }
}

