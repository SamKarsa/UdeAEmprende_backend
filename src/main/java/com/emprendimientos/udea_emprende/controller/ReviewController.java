package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Review;
import com.emprendimientos.udea_emprende.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @PostMapping
    public Review createNewReview(@RequestBody Review newReview) {
        reviewService.saveReview(newReview);
        return newReview;
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Integer id) {
        return reviewService.getReviewById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReviewById(@PathVariable Integer id) {
        reviewService.deleteReviewById(id);
    }

}
