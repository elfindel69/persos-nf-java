package inc.cwg.persos_nf.models;

import java.time.LocalDate;
import java.util.List;

public class Personnage {
    private String nom;
    private String prenom;
    private LocalDate DdNAD;
    private ICDate DdNIC;
    private Lieu LieuNaissance;
    private String metier;
    private String ethnie;
    private String ordre;
    private String titre;
    private Lieu lieuHabitation;
    private Sexe sexe;
    private int taille;
    private int poids;
    private String couleurPeau;
    private String corpulence;
    private String couleurCheveux;
    private String couleurYeux;
    private List<String> signesDistinctifs;
    private List<Parcours> parcours;
    private List<String> hobbies;
    private List<String> caracteres;
    private List<Lien> liens;
    private String lore;

    public Personnage(String nom, String prenom, LocalDate ddNAD, ICDate ddNIC, Lieu lieuNaissance,
                      String metier, int taille, int poids, String couleurCheveux, String couleurYeux,Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        DdNAD = ddNAD;
        DdNIC = ddNIC;
        LieuNaissance = lieuNaissance;
        this.metier = metier;
        this.taille = taille;
        this.poids = poids;
        this.couleurCheveux = couleurCheveux;
        this.couleurYeux = couleurYeux;
        this.sexe = sexe;
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
        return DdNAD;
    }

    public void setDdNAD(LocalDate ddNAD) {
        DdNAD = ddNAD;
    }

    public ICDate getDdNIC() {
        return DdNIC;
    }

    public void setDdNIC(ICDate ddNIC) {
        DdNIC = ddNIC;
    }

    public Lieu getLieuNaissance() {
        return LieuNaissance;
    }

    public void setLieuNaissance(Lieu lieuNaissance) {
        LieuNaissance = lieuNaissance;
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

    public List<String> getSignesDistinctifs() {
        return signesDistinctifs;
    }

    public void setSignesDistinctifs(List<String> signesDistinctifs) {
        this.signesDistinctifs = signesDistinctifs;
    }

    public List<Parcours> getParcours() {
        return parcours;
    }

    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(List<String> caracteres) {
        this.caracteres = caracteres;
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
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", DdNAD=" + DdNAD +
                ", DdNIC=" + DdNIC +
                ", LieuNaissance=" + LieuNaissance +
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
                ", caracteres=" + caracteres +
                ", liens=" + liens +
                ", lore='" + lore + '\'' +
                '}';
    }
}
