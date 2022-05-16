package inc.cwg.persos_nf.models;

import javax.persistence.*;

@Entity
public class Parcours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private int anneeAD;
    private int anneeIC;

    @ManyToOne
    @JoinColumn(name = "personnage_id")
    private Personnage personnage;

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Parcours(String nom, int anneeAD, int anneeIC) {
        this.nom = nom;
        this.anneeAD = anneeAD;
        this.anneeIC = anneeIC;
    }

    public Parcours() {

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
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", anneeAD=" + anneeAD +
                ", anneeIC=" + anneeIC +
                '}';
    }
}
