package Ashwini.Engineer.relationentity.repository;

import Ashwini.Engineer.relationentity.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
