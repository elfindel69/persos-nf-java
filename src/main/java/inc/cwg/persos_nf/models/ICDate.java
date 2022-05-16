package inc.cwg.persos_nf.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ICDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int annee;
    private int mois;
    private int jour;

    public ICDate(int annee, int mois, int jour) {
        this.annee = annee;
        this.mois = mois;
        this.jour = jour;
    }

    public ICDate() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", annee=" + annee +
                ", mois=" + mois +
                ", jour=" + jour +
                '}';
    }
}
