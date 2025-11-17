package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollments_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "specialties_id")
    private Specialty specialty;

    @ManyToOne
    @JoinColumn(name = "departments_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "advisors_id")
    private Advisor advisor;

    @Column(name = "academic_status")
    private String academicStatus;

    @Column(name = "education_mode")
    private String educationMode;

    @Column(name = "study_form")
    private String studyForm;

    @Column(name = "study_year")
    private Integer studyYear;

    private String funding;

    @Column(name = "thesis_topic")
    private String thesisTopic;

    @Column(name = "admission_date")
    private LocalDate admissionDate;

    @Column(name = "expected_grad_date")
    private LocalDate expectedGradDate;

    @Column(name = "enrollment_order_no")
    private String enrollmentOrderNo;

    @Column(name = "enrollment_order_date")
    private LocalDate enrollmentOrderDate;

    @Column(name = "expulsion_order_no")
    private String expulsionOrderNo;

    @Column(name = "expulsion_order_date")
    private LocalDate expulsionOrderDate;

    @Column(name = "expulsion_reason")
    private String expulsionReason;

    @Column(name = "other_orders_note")
    private String otherOrdersNote;

    @Column(name = "previous_university_name")
    private String previousUniversityName;
}
