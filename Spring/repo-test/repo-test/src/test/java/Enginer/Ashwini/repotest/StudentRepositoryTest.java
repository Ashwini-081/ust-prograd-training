package Enginer.Ashwini.repotest;

import Enginer.Ashwini.repotest.entity.Student;
import Enginer.Ashwini.repotest.repository.StudentRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository repo;
    @Nested
    class checksIfEmailExistsOrNot{
        @BeforeEach
        public void setup(){
            Student khavin=new Student("khavin","Khavin@gmail.com",25);
            repo.save(khavin);

        }
        @AfterEach
        public void tearDown(){
            repo.deleteAll();

        }

        @Test
        public void returnsTrueIfEmailExists(){

            Boolean actual=repo.checkIfEmailExists("Khavin@gmail.com");


            Assertions.assertTrue(actual);

        }
        @Test

        public void returnsFalseIfEmailDoesNotExists(){
            Boolean actual=repo.checkIfEmailExists("ashwini@gmail.com");
            Assertions.assertEquals(false,actual);

        }

    }



}
