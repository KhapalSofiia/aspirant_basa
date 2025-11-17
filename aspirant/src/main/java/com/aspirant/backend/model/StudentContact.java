package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "studentcontacts")
@Data
public class StudentContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_contacts_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Student student;

    private String type;

    private String value;

    @Column(name = "is_primary")
    private Boolean isPrimary;
}