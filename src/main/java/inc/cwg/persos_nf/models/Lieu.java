package inc.cwg.persos_nf.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ville;
    private String etat;
    private String systeme;
    private String pays;

    public Lieu(String ville, String etat, String systeme, String pays) {
        this.ville = ville;
        this.etat = etat;
        this.systeme = systeme;
        this.pays = pays;
    }

    public Lieu() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getSysteme() {
        return systeme;
    }

    public void setSysteme(String systeme) {
        this.systeme = systeme;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Lieu{" +
                "id=" + id +
                ", ville='" + ville + '\'' +
                ", etat='" + etat + '\'' +
                ", systeme='" + systeme + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
