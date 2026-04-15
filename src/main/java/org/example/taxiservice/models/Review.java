package org.example.taxiservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = "bookingReview")
/**
 * custom table name
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
/**
 * what actually entity listerners to basically adding the hooks in the
 */
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    private Double ratings;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)//this annotations tells spring about
    // the formate of date object to bestored i.e date/time?timestamp
    @CreatedDate // this annotation tells spring that only handle it for the
    // object creation
    private Date createAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate// this annotations tells spring that only handle it for
    // object update
    private Date updateAt;

    @Override
    public String toString() {
        return "Review "+this.content +" " +this.ratings + " " +this.createAt + " " +this.updateAt;
    }
}
//new