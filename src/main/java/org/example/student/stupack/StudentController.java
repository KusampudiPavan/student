package org.example.student.stupack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping()
	public List<StudentModel> getStudents(){
//		return List.of(
//				new StudentModel(
//						1L,
//						"Pavan",
//						"pavan@gmail.com",
//						LocalDate.of(2000, Month.SEPTEMBER, 2),
//						23
//				)
//		);
        return studentService.getStudents();
	}

    @PostMapping
    public void registerNewStudent(@RequestBody StudentModel student){
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentID") Long studentId){
        studentService.deleteStudent(studentId);

    }
}
