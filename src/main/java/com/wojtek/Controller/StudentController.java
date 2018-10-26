package com.wojtek.Controller;

import com.wojtek.Entity.Student;
import com.wojtek.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentsService.getAllStudents();
    }

}
