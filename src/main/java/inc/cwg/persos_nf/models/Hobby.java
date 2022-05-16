package inc.cwg.persos_nf.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    @ManyToMany
    @JoinTable(name = "hobby_personnages",
            joinColumns = @JoinColumn(name = "hobby_null"),
            inverseJoinColumns = @JoinColumn(name = "personnages_null"))
    private List<Personnage> personnages = new ArrayList<>();

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Hobby() {
    }

    public Hobby(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
