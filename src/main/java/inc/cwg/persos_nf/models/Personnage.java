package inc.cwg.persos_nf.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Personnage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private LocalDate ddNAD;

    private String metier;
    private String ethnie;
    private String ordre;
    private String titre;

    private Sexe sexe;
    private int taille;
    private int poids;
    private String couleurPeau;
    private String corpulence;
    private String couleurCheveux;
    private String couleurYeux;

    @Lob
    private String lore;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "dd_nic_id")
    private ICDate ddNIC;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "lieu_naissance_id")
    private Lieu lieuNaissance;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "lieu_habitation_id")
    private Lieu lieuHabitation;

    @OneToMany(mappedBy = "personnage", orphanRemoval = true)
    private List<Parcours> parcours = new ArrayList<>();

    @OneToMany(mappedBy = "source", orphanRemoval = true)
    private List<Lien> liens = new ArrayList<>();

    @ManyToMany(mappedBy = "personnages")
    private List<Hobby> hobbies = new ArrayList<>();

    @ManyToMany(mappedBy = "personnages")
    private List<SigneDistinctif> signesDistinctifs = new ArrayList<>();

    @ManyToMany(mappedBy = "personnages")
    private List<TraitCaractere> traitCaracteres = new ArrayList<>();

    public List<TraitCaractere> getTraitCaracteres() {
        return traitCaracteres;
    }

    public void setTraitCaracteres(List<TraitCaractere> traitCaracteres) {
        this.traitCaracteres = traitCaracteres;
    }

    public Personnage(String nom, String prenom, LocalDate ddNAD, ICDate ddNIC, Lieu lieuNaissance,
                      String metier, int taille, int poids, String couleurCheveux, String couleurYeux, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.ddNAD = ddNAD;
        this.ddNIC = ddNIC;
        this.lieuNaissance = lieuNaissance;
        this.metier = metier;
        this.taille = taille;
        this.poids = poids;
        this.couleurCheveux = couleurCheveux;
        this.couleurYeux = couleurYeux;
        this.sexe = sexe;
    }

    public Personnage() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDdNAD() {
        return ddNAD;
    }

    public void setDdNAD(LocalDate ddNAD) {
        this.ddNAD = ddNAD;
    }

    public ICDate getDdNIC() {
        return ddNIC;
    }

    public void setDdNIC(ICDate ddNIC){
    this.ddNIC = ddNIC;
    }

    public Lieu getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(Lieu lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getEthnie() {
        return ethnie;
    }

    public void setEthnie(String ethnie) {
        this.ethnie = ethnie;
    }

    public String getOrdre() {
        return ordre;
    }

    public void setOrdre(String ordre) {
        this.ordre = ordre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Lieu getLieuHabitation() {
        return lieuHabitation;
    }

    public void setLieuHabitation(Lieu lieuHabitation) {
        this.lieuHabitation = lieuHabitation;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getCouleurPeau() {
        return couleurPeau;
    }

    public void setCouleurPeau(String couleurPeau) {
        this.couleurPeau = couleurPeau;
    }

    public String getCorpulence() {
        return corpulence;
    }

    public void setCorpulence(String corpulence) {
        this.corpulence = corpulence;
    }

    public String getCouleurCheveux() {
        return couleurCheveux;
    }

    public void setCouleurCheveux(String couleurCheveux) {
        this.couleurCheveux = couleurCheveux;
    }

    public String getCouleurYeux() {
        return couleurYeux;
    }

    public void setCouleurYeux(String couleurYeux) {
        this.couleurYeux = couleurYeux;
    }

    public List<SigneDistinctif> getSignesDistinctifs() {
        return this.signesDistinctifs;
    }

    public void setSignesDistinctifs(List<SigneDistinctif> signesDistinctifs) {
        this.signesDistinctifs = signesDistinctifs;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }


    public List<Lien> getLiens() {
        return liens;
    }

    public void setLiens(List<Lien> liens) {
        this.liens = liens;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", DdNAD=" + ddNAD +
                ", DdNIC=" + ddNIC +
                ", LieuNaissance=" + lieuNaissance +
                ", metier='" + metier + '\'' +
                ", ethnie='" + ethnie + '\'' +
                ", ordre='" + ordre + '\'' +
                ", titre='" + titre + '\'' +
                ", lieuHabitation=" + lieuHabitation +
                ", sexe=" + sexe +
                ", taille=" + taille +
                ", poids=" + poids +
                ", couleurPeau='" + couleurPeau + '\'' +
                ", corpulence='" + corpulence + '\'' +
                ", couleurCheveux='" + couleurCheveux + '\'' +
                ", couleurYeux='" + couleurYeux + '\'' +
                ", signesDistinctifs=" + signesDistinctifs +
                ", parcours=" + parcours +
                ", hobbies=" + hobbies +
                ", caractere=" + traitCaracteres +
                ", liens=" + liens +
                ", lore='" + lore + '\'' +
                '}';
    }
}
