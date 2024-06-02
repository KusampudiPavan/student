package org.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);


	}
	//Ctrl + ALT + O - remove all imports that are hashed.

//	@GetMapping()
//	public List<StudentModel> hello(){
//		return List.of(
//				new StudentModel(
//						1L,
//						"Pavan",
//						"pavan@gmail.com",
//						LocalDate.of(2000, Month.SEPTEMBER, 2),
//						23
//
//
//				)
//		);
//	}

}
