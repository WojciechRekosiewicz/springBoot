package com.wojtek.Service;

import com.wojtek.Dao.StudentDao;
import com.wojtek.Entity.Student;
import org.springframework.stereotype.Service;


import java.util.Collection;


@Service
public class StudentsService {

    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
}
