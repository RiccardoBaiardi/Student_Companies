package com.S.C.S.C;

import com.S.C.S.C.utents.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Qui puoi aggiungere metodi personalizzati se necessario
}