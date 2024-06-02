package org.example.student.stupack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            StudentModel pavan = new StudentModel(
						1L,
						"Pavan",
						"pavan@gmail.com",
						LocalDate.of(2000, Month.SEPTEMBER, 2)
            );
            repository.saveAll(
                    List.of(pavan)
            );


        };
    }
}
