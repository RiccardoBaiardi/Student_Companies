package com.S.C.S.C.utents;

import com.S.C.S.C.StudentRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtentService {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//
//    public void addStudent(Student student) {
//        entityManager.persist(student);
//    }



    @Autowired
    private StudentRepository studentRepository;




    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    public Optional<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteRun(int id) {
        studentRepository.deleteById(id);
    }
}


