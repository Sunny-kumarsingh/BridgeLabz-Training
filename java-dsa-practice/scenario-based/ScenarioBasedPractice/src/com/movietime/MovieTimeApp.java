package com.movietime;
public class MovieTimeApp {

    public static void main(String[] args) {

        // Initial showtimes
        int[] shows = {60, 120, 180, 240};

        Theater theater = new Theater(shows);

        System.out.println("Before adding new show:");
        theater.displayShows();

        
        theater.addNewShow(780);

        System.out.println("After adding new show:");
        theater.displayShows();
    }
}
