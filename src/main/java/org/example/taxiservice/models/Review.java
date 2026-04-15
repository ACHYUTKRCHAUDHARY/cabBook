package org.example.taxiservice.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

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
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)//this annotations tells spring about
    // the formate of date object to bestored i.e date/time?timestamp
    @CreatedDate // this annotation tells spring that only handle it for the
    // object creation
    Date createAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate// this annotations tells spring that only handle it for
    // object update
    Date updateAt;
}
//new