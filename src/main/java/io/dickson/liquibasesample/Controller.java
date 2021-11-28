package io.dickson.liquibasesample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class Controller {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String test() {
    	return "working";
    }
    
    @PostMapping("student")
    public String createStudent(@RequestParam String name) {
    	Student student= new Student(1,name,"1","2","3");
        studentRepository.save(student);
        String nameToReturn = studentRepository.findByName(name);
//        return studentRepository.findByName(name) + " Saved successfully";
        return nameToReturn + " Saved successfully";
    }

    @GetMapping("student")
    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

}
