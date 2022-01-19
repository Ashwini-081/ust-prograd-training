package Ashwini.Engineer.relationentity.controller;

import Ashwini.Engineer.relationentity.entity.Faculty;
import Ashwini.Engineer.relationentity.entity.Student;
import Ashwini.Engineer.relationentity.repository.FacultyRepository;
import Ashwini.Engineer.relationentity.services.FacultyServices;
import Ashwini.Engineer.relationentity.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    private FacultyServices service;

    @GetMapping("/faculties")
    public List<Faculty> list(){
        return service.getAllFaculties();//To Read
    }
    //create student using query parameter
    @GetMapping("/faculties/new") //localhost:8080/student/new?name=some&page=xx
    public Faculty create(HttpServletRequest request){
        String name=request.getParameter("name");


        Faculty faculty=new Faculty(name);
        return service.save(faculty);

    }

}

/*
1)one to one
student-admission relation
student-id,name,dept
admission-student_id,no,batch,id
department-name,hod,id
2)one-many
student-department

3)many-one
department-student

4)many-many
Student-course
Student-roll,name,age
course-id,name,weightage

student_course-roll,id


 */