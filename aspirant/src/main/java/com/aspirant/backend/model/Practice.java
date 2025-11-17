package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "practices")
@Data
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "practices_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "enrollments_id")
    private Enrollment enrollment;

    @Column(name = "practice_no")
    private String practiceNo;

    @Column(name = "date_start")
    private LocalDate dateStart;

    @Column(name = "date_end")
    private LocalDate dateEnd;

    private String status;

    private String note;
}
