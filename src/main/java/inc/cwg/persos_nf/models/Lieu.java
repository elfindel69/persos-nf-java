package inc.cwg.persos_nf.models;

public class Lieu {
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
                "ville='" + ville + '\'' +
                ", etat='" + etat + '\'' +
                ", systeme='" + systeme + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
