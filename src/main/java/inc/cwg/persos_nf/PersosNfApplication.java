package inc.cwg.persos_nf;

import inc.cwg.persos_nf.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		parcoursClaude.add(new Parcours("Etudiant à l’Université de Lyon",2247,147));
		parcoursClaude.add(new Parcours("Participe à la mission de colonisation de Luyten Prime",2250,150));
		claude.setParcours(parcoursClaude);
		List<String> hobbiesClaude = new ArrayList<>();
		hobbiesClaude.add("Musique");
		hobbiesClaude.add("Football");
		hobbiesClaude.add("Photographie");
		claude.setHobbies(hobbiesClaude);
		List<String> caractereClaude = new ArrayList<>();
		caractereClaude.add("Malicieux");
		caractereClaude.add("Espiègle");
		caractereClaude.add("Rusé");
		caractereClaude.add("Intelligent");
		claude.setCaracteres(caractereClaude);
		claude.setLore("Agé de 20 ans, Claude est un brillant étudiant en astrophysique à l’Université de Lyon." +
				" Passionné de musique, membre du groupe Electric Kittens," +
				" il s’est engagé pour la mission de colonisation de Luyten Prime avec ses amis. ");

		System.out.println(claude);
	}
}
