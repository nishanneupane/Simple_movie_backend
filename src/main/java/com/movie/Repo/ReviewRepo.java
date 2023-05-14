package com.movie.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.Entity.Review;

public interface ReviewRepo extends JpaRepository<Review, Long> {

	

}
