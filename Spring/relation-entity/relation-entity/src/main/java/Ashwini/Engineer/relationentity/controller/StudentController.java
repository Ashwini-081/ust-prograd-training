package Ashwini.Engineer.relationentity.controller;

import Ashwini.Engineer.relationentity.entity.Student;
import Ashwini.Engineer.relationentity.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;



@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> list(){
        return service.getAllStudents();//To Read
    }
    //create student using query parameter
    @GetMapping("/student/new") //localhost:8080/student/new?name=some&page=xx
    public Student create(HttpServletRequest request){
        String name=request.getParameter("name");
        Integer age=Integer.parseInt(request.getParameter("age"));

        Student student=new Student(name,age);
        return service.save(student);

    }
}
