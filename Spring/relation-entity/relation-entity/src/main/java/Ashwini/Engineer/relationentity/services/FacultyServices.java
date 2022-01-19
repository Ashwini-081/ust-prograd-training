package Ashwini.Engineer.relationentity.services;

import Ashwini.Engineer.relationentity.entity.Faculty;
import Ashwini.Engineer.relationentity.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServices {
    @Autowired
    private FacultyRepository repo;

    public List<Faculty> getAllFaculties() {

        return repo.findAll();
    }

    public Faculty save(Faculty faculty) {
        return repo.save(faculty);
    }
}
