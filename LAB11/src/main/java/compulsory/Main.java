package compulsory;
import compulsory.repository.PlayerRepositoryImplementation;
import compulsory.model.Player;
import compulsory.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Main.
 */
@SpringBootApplication
public class Main {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

    }
}