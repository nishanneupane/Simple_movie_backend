package com.movie.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.movie.Entity.Movie;
import com.movie.Entity.Review;
import com.movie.Repo.MovieRepo;
import com.movie.Repo.ReviewRepo;

@Service
public class ReviewService{
	
	@Autowired
	private ReviewRepo reviewRepo;
	
	@Autowired
	private MovieRepo movieRepo;
	
	
	//private ModelMapper modelMapper;
	
	public Review createReview(Review review) {
	    
	    return reviewRepo.save(review);
	}


	
	
	

}
