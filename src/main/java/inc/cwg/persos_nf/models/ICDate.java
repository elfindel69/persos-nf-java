package inc.cwg.persos_nf.models;

public class ICDate {
    private int annee;
    private int mois;
    private int jour;

    public ICDate(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    @Override
    public String toString() {
        return "ICDate{" +
                "annee=" + annee +
                ", mois=" + mois +
                ", jour=" + jour +
                '}';
    }
}
