package inc.cwg.persos_nf.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TraitCaractere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    @ManyToMany
    @JoinTable(name = "trait_caractere_personnages",
            joinColumns = @JoinColumn(name = "trait_caractere_null"),
            inverseJoinColumns = @JoinColumn(name = "personnages_null"))
    private List<Personnage> personnages = new ArrayList<>();

    public TraitCaractere(String nom) {
        this.nom = nom;
    }

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public TraitCaractere() {
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
        return "TraitCaractere{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
