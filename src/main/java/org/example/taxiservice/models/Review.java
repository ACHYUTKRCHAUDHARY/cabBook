package org.example.taxiservice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bookingReview")
/**
 * custom table name
 */
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    String content;

    Double ratings;
}
