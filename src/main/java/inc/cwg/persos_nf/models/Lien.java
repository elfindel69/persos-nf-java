package inc.cwg.persos_nf.models;

import javax.persistence.*;

@Entity
public class Lien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String type;


    @ManyToOne
    @JoinColumn(name = "source_id")
    private Personnage source;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "cible_id")
    private Personnage cible;

    public Personnage getSource() {
        return source;
    }

    public void setSource(Personnage source) {
        this.source = source;
    }

    public Lien(String type, Personnage cible) {
        this.type = type;
        this.cible = cible;
    }

    public Lien() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", type='" + type + '\'' +
                ", cible=" + cible +
                '}';
    }
}
