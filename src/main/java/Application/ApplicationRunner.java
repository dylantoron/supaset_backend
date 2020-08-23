package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackageClasses = {Service.StrengthTrainingService.class})
@EnableJpaRepositories(basePackageClasses = {DAO.SetsRepository.class, DAO.LiftsRepository.class})
@EntityScan(basePackageClasses = {Entity.Lifts.class, Entity.Sets.class, Entity.Schedule.class})
public class ApplicationRunner {

    public static void main(String[] args){
        SpringApplication.run(ApplicationRunner.class, args);
    }


}
