package com.mmashour.studentservice.repository;
import com.mmashour.studentservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Mahmoud
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
