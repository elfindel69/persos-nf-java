package inc.cwg.persos_nf.models;

public class Lien {
    private String type;
    private Personnage cible;

    public Lien(String type, Personnage cible) {
        this.type = type;
        this.cible = cible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Personnage getCible() {
        return cible;
    }

    public void setCible(Personnage cible) {
        this.cible = cible;
    }

    @Override
    public String toString() {
        return "Lien{" +
                "type='" + type + '\'' +
                ", cible=" + cible +
                '}';
    }
}
