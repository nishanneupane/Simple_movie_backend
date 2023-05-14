package com.movie.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.Entity.Movie;
import com.movie.Repo.MovieRepo;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;

	public Optional<Movie> getSingleMovie(Long id) {

		return movieRepo.findById(id);

	}

	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}

	public Movie addMovies(Movie movie) {
		return movieRepo.save(movie);
	}
}
