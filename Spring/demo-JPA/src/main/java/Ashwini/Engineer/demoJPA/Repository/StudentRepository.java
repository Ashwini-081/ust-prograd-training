package Ashwini.Engineer.demoJPA.Repository;

import Ashwini.Engineer.demoJPA.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}