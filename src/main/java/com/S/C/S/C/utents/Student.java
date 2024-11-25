package com.S.C.S.C.utents;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends Utent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int university;

//    public Student(long id, String name, String surname, int university) {
//        this.id = id;
//        this.name = name;
//        this.surname = surname;
//        this.university = university;
//    }

//    public Student() {
//    }
}
