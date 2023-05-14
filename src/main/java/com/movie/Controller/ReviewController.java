package com.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.Entity.Review;
import com.movie.service.ReviewService;


@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin("*")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@PostMapping("/review")
	public ResponseEntity<Review> createReview(@RequestBody Review review){
		return new ResponseEntity<Review>(reviewService.createReview(review),HttpStatus.CREATED);
	}

}
