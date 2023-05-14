package com.movie.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.Entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long> {
}
