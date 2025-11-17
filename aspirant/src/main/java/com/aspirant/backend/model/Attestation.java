package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "attestations")
@Data
public class Attestation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attestations_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "enrollments_id")
    private Enrollment enrollment;

    private String season;

    private Integer year;

    @Column(name = "attestation_no")
    private String attestationNo;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "result_note")
    private String resultNote;
}
