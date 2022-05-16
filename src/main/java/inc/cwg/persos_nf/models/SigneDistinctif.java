package inc.cwg.persos_nf.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SigneDistinctif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    @ManyToMany
    @JoinTable(name = "signe_distinctif_personnages",
            joinColumns = @JoinColumn(name = "signe_distinctif_null"),
            inverseJoinColumns = @JoinColumn(name = "personnages_null"))
    private List<Personnage> personnages = new ArrayList<>();

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public SigneDistinctif(String nom) {
        this.nom = nom;
    }

    public SigneDistinctif(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SigneDistinctif{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
