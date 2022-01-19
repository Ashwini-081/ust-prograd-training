package Enginer.Ashwini.repotest.repository;

import Enginer.Ashwini.repotest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("SELECT CASE WHEN COUNT(s)>0"+"THEN TRUE ELSE FALSE END"+"FROM Student WHERE s.email=?1")//?1 first argument say email
    public Boolean checkIfEmailExists(String email);


}
