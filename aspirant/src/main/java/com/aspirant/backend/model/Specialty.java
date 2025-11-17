package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "specialties")
@Data
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialties_id")
    private Long id;

    private String code;

    private String name;

    @ManyToOne
    @JoinColumn(name = "departments_id")
    private Department department;
}
