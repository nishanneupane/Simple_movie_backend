package com.movie.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.Entity.Movie;
import com.movie.service.MovieService;


@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin("http://localhost:3000/")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/")
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<List<Movie>>(movieService.getAllMovies(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Movie> addMovies(@RequestBody Movie movie){
		return new ResponseEntity<Movie>(this.movieService.addMovies(movie),HttpStatus.OK);
	}
	
	@GetMapping("/{mid}")
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable Long mid){
		return new ResponseEntity<Optional<Movie>>(movieService.getSingleMovie(mid),HttpStatus.OK);
	}

}
