package com.S.C.S.C;


import com.S.C.S.C.utents.Student;
import com.S.C.S.C.utents.Utent;
import com.S.C.S.C.utents.UtentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SC")
public class Controller {
    @Autowired
    private UtentService utentService;

    // Endpoint per creare uno studente
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return utentService.createStudent(student);
    };

    @GetMapping
    String home(){
        return "Home page";
    };

}