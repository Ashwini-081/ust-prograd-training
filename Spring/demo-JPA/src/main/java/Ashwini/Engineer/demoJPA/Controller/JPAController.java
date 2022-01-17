package Ashwini.Engineer.demoJPA.Controller;



import Ashwini.Engineer.demoJPA.Entity.Student;
import Ashwini.Engineer.demoJPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class JPAController {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student= new Student("Ashwini", "2A",100.90F, 22, "10932675L");
        service.saveStudent(student);
        return "Saved";
    }

    @RequestMapping(value = "/create")
    public Student create(HttpServletRequest request){
        String name = request.getParameter("name");
        String phone = request.getParameter("contact");
        Student student= new Student(name, "2A",100.90F, 22, phone);
        return  service.saveStudent(student);
    }

    @RequestMapping("/list")
    public List<Student> list(){
        return service.listAll();
    }
}
