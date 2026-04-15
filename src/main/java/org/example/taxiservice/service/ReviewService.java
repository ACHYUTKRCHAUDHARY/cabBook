package org.example.taxiservice.service;

import org.example.taxiservice.models.Review;
import org.example.taxiservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;



@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;

    //bean
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************");
        // Review review = new Review();default way of creating the Review
        // object

        Review r=Review
                .builder()
                .content("This is a review")
                .ratings(5.0)
                .build();//code to create plain java object

        reviewRepository.save(r);//this code executes the sql query
    }
}
