package com.aspirant.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "status_history")
@Data
public class StatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_history_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "enrollments_id")
    private Enrollment enrollment;

    @Column(name = "changed_at")
    private LocalDateTime changedAt;

    @Column(name = "old_status")
    private String oldStatus;

    @Column(name = "new_status")
    private String newStatus;

    private String note;
}
