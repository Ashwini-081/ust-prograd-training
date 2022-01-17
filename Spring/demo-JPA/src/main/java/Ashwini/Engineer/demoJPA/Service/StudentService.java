package Ashwini.Engineer.demoJPA.Service;

import Ashwini.Engineer.demoJPA.Entity.Student;
import Ashwini.Engineer.demoJPA.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.List;
@Service
public class StudentService{
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student){
        return repo.save(student);
    }


    public List<Student> listAll(){
        return repo.findAll();
    }
}
