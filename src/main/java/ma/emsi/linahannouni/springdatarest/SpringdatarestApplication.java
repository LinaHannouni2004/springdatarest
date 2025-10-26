package ma.emsi.linahannouni.springdatarest;

import ma.emsi.linahannouni.springdatarest.enums.Genre;
import ma.emsi.linahannouni.springdatarest.model.Centre;
import ma.emsi.linahannouni.springdatarest.model.Etudiant;
import ma.emsi.linahannouni.springdatarest.repository.CentreRepository;
import ma.emsi.linahannouni.springdatarest.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringdatarestApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatarestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Centre c1 = Centre.builder()
                .nomCentre("Centre Casablanca")
                .adresse("Bd Anfa, Casablanca")
                .build();

        Centre c2 = Centre.builder()
                .nomCentre("Centre Rabat")
                .adresse("Avenue Mohammed V, Rabat")
                .build();

        centreRepository.saveAll(List.of(c1, c2));


        Etudiant e1 = Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .centre(c1)
                .build();

        Etudiant e2 = Etudiant.builder()
                .nom("Lina")
                .prenom("Hannouni")
                .genre(Genre.Femme)
                .centre(c2)
                .build();

        etudiantRepository.saveAll(List.of(e1, e2));

        System.out.println("Données insérées avec succès !");
    }
}
