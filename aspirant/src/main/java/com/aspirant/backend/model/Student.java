package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "students_id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    private String gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String phone;

    @Column(name = "email_academic")
    private String emailAcademic;
}