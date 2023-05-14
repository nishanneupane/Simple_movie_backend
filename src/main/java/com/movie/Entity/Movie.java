package com.movie.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "movies")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mid;
	
	
	private String ImdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private String poster;
	
	@Lob
	private List<String> backdrops;
	@Lob
	private List<String> genres; 
	
	 @OneToMany
	private List<Review> reviews;

}
