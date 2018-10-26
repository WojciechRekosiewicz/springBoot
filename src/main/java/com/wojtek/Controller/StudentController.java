package com.wojtek.Controller;

import com.wojtek.Entity.Student;
import com.wojtek.Service.StudentsService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
public class StudentController {

    private StudentsService studentsService;

    public Collection<Student> getAllStudents(){
        return studentsService.getAllStudents();
    }

}
