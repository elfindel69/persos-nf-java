package inc.cwg.persos_nf.models;

public class Parcours {
    private String nom;
    private int anneeAD;
    private int anneeIC;

    public Parcours(String nom, int anneeAD, int anneeIC) {
        this.nom = nom;
        this.anneeAD = anneeAD;
        this.anneeIC = anneeIC;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeAD() {
        return anneeAD;
    }

    public void setAnneeAD(int anneeAD) {
        this.anneeAD = anneeAD;
    }

    public int getAnneeIC() {
        return anneeIC;
    }

    public void setAnneeIC(int anneeIC) {
        this.anneeIC = anneeIC;
    }

    @Override
    public String toString() {
        return "Parcours{" +
                "nom='" + nom + '\'' +
                ", anneeAD=" + anneeAD +
                ", anneeIC=" + anneeIC +
                '}';
    }
}
