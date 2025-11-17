package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "advisors")
@Data
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "advisors_id")
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "departments_id")
    private Department department;
}