package com.mmashour.studentservice.service;

import com.mmashour.studentservice.model.Student;
import java.util.List;

/**
 *
 * @author Mahmoud
 */
public interface StudentService {

    Student save(Student student);

    List<Student> getAll();
}
