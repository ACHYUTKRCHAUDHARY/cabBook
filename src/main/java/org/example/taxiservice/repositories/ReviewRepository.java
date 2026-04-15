package org.example.taxiservice.repositories;

import org.example.taxiservice.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * repository layer is used for special dedicated use case for handling the
 * logic with db layer
 */

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {

}