package inc.cwg.persos_nf.controller;

import inc.cwg.persos_nf.models.*;
import inc.cwg.persos_nf.service.*;
import inc.cwg.persos_nf.utils.Utils;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PersosNFController {
   private final ICDateService icDateService;
   private final LieuService lieuService;
   private final ParcoursService parcoursService;
   private final HobbyService hobbyService;
   private final TraitCaractereService traitCaractereService;
   private final PersonnageService personnageService;
    public PersosNFController(ICDateService icDateService, LieuService lieuService,
                              ParcoursService parcoursService, HobbyService hobbyService, TraitCaractereService traitCaractereService,
                              PersonnageService personnageService) {
        super();
        this.icDateService = icDateService;
        this.lieuService = lieuService;
        this.parcoursService = parcoursService;
        this.hobbyService = hobbyService;
        this.traitCaractereService = traitCaractereService;
        this.personnageService = personnageService;
    }

    @PostConstruct
    private void init() throws ParseException {
        if(icDateService.recupererDates().isEmpty()){

            icDateService.ajouterDate(150,5,10);
        }
        if(lieuService.recupererLieux().isEmpty()){
            lieuService.ajouterLieu("Lyon","France","Sol","TE");
            lieuService.ajouterLieu("Croft","Luyten Prime","Luyten","TE");

        }
        if(parcoursService.recupererAllParcours().isEmpty()){
            String p1 = "Etudiant à l’Université de Lyon";
            String p1Utf8 = Utils.getUtf8(p1);
            parcoursService.ajouterParcours(p1Utf8,2247,147);
            String p2 = "Participe à la mission de colonisation de Luyten Prime";
            String p2Utf8 = Utils.getUtf8(p2);
            parcoursService.ajouterParcours(p2Utf8,2250,150);
        }
        if(hobbyService.recupererHobbies().isEmpty()){
            hobbyService.ajouterHobby("Musique");
            hobbyService.ajouterHobby("Football");
            hobbyService.ajouterHobby("Photographie");
        }
        if(traitCaractereService.recupererTraitsCaractere().isEmpty()){
            traitCaractereService.ajouterTraitCaractere("Malicieux");
            String c1 = "Espiègle";
            String c1Utf8 = Utils.getUtf8(c1);
            traitCaractereService.ajouterTraitCaractere(c1Utf8);
            String c2 = "Rusé";
            String c2Utf8 = Utils.getUtf8(c2);
            traitCaractereService.ajouterTraitCaractere(c2Utf8);
            traitCaractereService.ajouterTraitCaractere("Intelligent");
        }
        if(personnageService.recupererPersonnages().isEmpty()){
            Personnage claude = new Personnage("Claude","Nowak", LocalDate.parse("2230-05-10")
                    ,icDateService.recupererDate(1),lieuService.recupererLieu(1),
                    "colon",170,70,"blond","pers", Sexe.H);
            claude.setCorpulence("moyenne");
            claude.setEthnie("Humain");
            claude.setOrdre("Civil");
            claude.setLieuHabitation(lieuService.recupererLieu(2));
            List<Parcours> parcoursClaude = new ArrayList<>();
            parcoursClaude.add(parcoursService.recupererParcoursById(1));
            parcoursClaude.add(parcoursService.recupererParcoursById(2));
            claude.setParcours(parcoursClaude);
            List<Hobby> hobbiesClaude = new ArrayList<>();
            Hobby h1 = hobbyService.recupererHobby(1);
            hobbiesClaude.add(h1);
            Hobby h2 = hobbyService.recupererHobby(2);
            hobbiesClaude.add(h2);
            Hobby h3 = hobbyService.recupererHobby(3);
            hobbiesClaude.add(h3);
            claude.setHobbies(hobbiesClaude);
            List<TraitCaractere> caractereClaude = new ArrayList<>();
            TraitCaractere tc1 = traitCaractereService.recupererTraitCaractere(1);
            caractereClaude.add(tc1);
            TraitCaractere tc2 = traitCaractereService.recupererTraitCaractere(2);
            caractereClaude.add(tc2);
            TraitCaractere tc3 = traitCaractereService.recupererTraitCaractere(3);
            caractereClaude.add(tc3);
            TraitCaractere tc4 = traitCaractereService.recupererTraitCaractere(4);
            caractereClaude.add(tc4);
            claude.setTraitCaracteres(caractereClaude);
            String lore = "Agé de 20 ans, Claude est un brillant étudiant en astrophysique à l'Université de Lyon." +
                    " Passionné de musique, membre du groupe Electric Kittens," +
                    " il s'est engagé pour la mission de colonisation de Luyten Prime avec ses amis. ";
            String loreUtf8 = Utils.getUtf8(lore);
            claude.setLore(loreUtf8);
            claude = personnageService.enregisterPersonnage(claude);
            List<Personnage> persos = new ArrayList<>();
            persos.add(claude);
            h1.setPersonnages(persos);
            hobbyService.enregistrerHobby(h1);
            h2.setPersonnages(persos);
            hobbyService.enregistrerHobby(h2);
            h3.setPersonnages(persos);
            hobbyService.enregistrerHobby(h3);
            tc1.setPersonnages(persos);
            traitCaractereService.enregistrerTraitCaractere(tc1);
            tc2.setPersonnages(persos);
            traitCaractereService.enregistrerTraitCaractere(tc2);
            tc3.setPersonnages(persos);
            traitCaractereService.enregistrerTraitCaractere(tc3);
            tc4.setPersonnages(persos);
            traitCaractereService.enregistrerTraitCaractere(tc4);

        }


    }
}
