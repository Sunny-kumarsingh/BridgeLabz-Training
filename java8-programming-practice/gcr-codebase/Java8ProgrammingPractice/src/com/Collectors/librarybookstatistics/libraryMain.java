package com.Collectors.librarybookstatistics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class libraryMain {
	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
		        new Book("Java Basics", "Technology", 450),
		        new Book("Spring in Action", "Technology", 550),
		        new Book("Harry Potter", "Fantasy", 350),
		        new Book("Lord of the Rings", "Fantasy", 900),
		        new Book("Atomic Habits", "Self-Help", 320)
		);
		
		Map<String, IntSummaryStatistics> statsByGenre =
		        books.stream()
		             .collect(Collectors.groupingBy(
		                 Book::getGenre,                      // group by genre
		                 Collectors.summarizingInt(
		                     Book::getPages                   // pages statistics
		                 )
		             ));

		statsByGenre.forEach((genre, stats) -> {
		    System.out.println("Genre: " + genre);
		    System.out.println("  Total Pages   : " + stats.getSum());
		    System.out.println("  Average Pages : " + stats.getAverage());
		    System.out.println("  Max Pages     : " + stats.getMax());
		});
	}
}
