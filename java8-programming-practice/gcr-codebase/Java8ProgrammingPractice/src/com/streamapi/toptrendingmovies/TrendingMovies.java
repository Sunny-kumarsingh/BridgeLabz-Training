package com.streamapi.toptrendingmovies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;

public class TrendingMovies {
	
	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList( 
				new Movie("Movie A", 8.5, 2023),
	            new Movie("Movie B", 9.0, 2024),
	            new Movie("Movie C", 8.8, 2022),
	            new Movie("Movie D", 9.0, 2021),
	            new Movie("Movie E", 8.9, 2024),
	            new Movie("Movie F", 9.2, 2023)
	    );
		
		movies.stream()
	    .filter(m -> m.rating > 8.5)
	    .sorted((m1, m2) -> {
	        if (m1.rating != m2.rating) {
	            return Double.compare(m2.rating, m1.rating); 
	        }
	        return Integer.compare(m2.year, m1.year); 
	    })
	    .limit(5)
	    .forEach(System.out::println);
		
	}	

}
