package petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "net")
public class GuruPetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuruPetClinicApplication.class, args);
    }

}
