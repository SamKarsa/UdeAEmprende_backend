package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.model.Review;
import com.emprendimientos.udea_emprende.repository.ReviewRepository;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Integer id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReviewById(Integer id) {
        reviewRepository.deleteById(id);
    }

}
