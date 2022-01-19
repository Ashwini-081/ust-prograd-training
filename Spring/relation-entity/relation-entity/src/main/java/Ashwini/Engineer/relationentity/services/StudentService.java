package Ashwini.Engineer.relationentity.services;

import Ashwini.Engineer.relationentity.entity.Student;
import Ashwini.Engineer.relationentity.repository.StudentRepository;
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

    public Student save(Student student) {
        return repo.save(student);
    }
}
