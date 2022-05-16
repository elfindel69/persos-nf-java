package inc.cwg.persos_nf;

import inc.cwg.persos_nf.models.*;
import inc.cwg.persos_nf.utils.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PersosNfApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersosNfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Personnage claude = new Personnage("Claude","Nowak",LocalDate.parse("2230-05-10")
				,new ICDate(150,5,10),new Lieu("Lyon","France","Sol","TE"),
				"colon",170,70,"blond","pers", Sexe.H);
		claude.setCorpulence("moyenne");
		claude.setEthnie("Humain");
		claude.setOrdre("Civil");
		claude.setLieuHabitation(new Lieu("Croft","Luyten Prime","Luyten","TE"));
		List<Parcours> parcoursClaude = new ArrayList<>();
		String p1 = "Etudiant à l’Université de Lyon";
		String p1Utf8 = Utils.getUtf8(p1);
		parcoursClaude.add(new Parcours(p1Utf8,2247,147));
		String p2 = "Participe à la mission de colonisation de Luyten Prime";
		String p2Utf8 = Utils.getUtf8(p2);
		parcoursClaude.add(new Parcours(p2Utf8,2250,150));
		claude.setParcours(parcoursClaude);
		List<Hobby> hobbiesClaude = new ArrayList<>();
		hobbiesClaude.add(new Hobby("Musique"));
		hobbiesClaude.add(new Hobby("Football"));
		hobbiesClaude.add(new Hobby("Photographie"));
		claude.setHobbies(hobbiesClaude);
		List<TraitCaractere> caractereClaude = new ArrayList<>();
		caractereClaude.add(new TraitCaractere("Malicieux"));
		String c1 = "Espiègle";
		String c1Utf8 = Utils.getUtf8(c1);
		caractereClaude.add(new TraitCaractere(c1Utf8));
		String c2 = "Rusé";
		String c2Utf8 = Utils.getUtf8(c2);
		caractereClaude.add(new TraitCaractere(c2Utf8));
		caractereClaude.add(new TraitCaractere("Intelligent"));
		claude.setTraitCaracteres(caractereClaude);

		String lore = "Agé de 20 ans, Claude est un brillant étudiant en astrophysique à l'Université de Lyon." +
				" Passionné de musique, membre du groupe Electric Kittens," +
				" il s'est engagé pour la mission de colonisation de Luyten Prime avec ses amis. ";
		String loreUtf8 = Utils.getUtf8(lore);
		claude.setLore(loreUtf8);

		System.out.println(claude);
	}


}
