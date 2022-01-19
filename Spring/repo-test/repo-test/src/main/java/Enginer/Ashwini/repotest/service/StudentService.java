package Enginer.Ashwini.repotest.service;

import Enginer.Ashwini.repotest.entity.Student;
import Enginer.Ashwini.repotest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).get();
    }

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public Boolean checkIfEmailExists(String email) {
        return repo.checkIfEmailExists(email);
    }
}