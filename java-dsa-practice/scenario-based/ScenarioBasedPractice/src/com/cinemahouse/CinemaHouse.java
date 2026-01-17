package com.cinemahouse;
public class CinemaHouse {

    public static void main(String[] args) {

        // movie show timings (in minutes for simplicity)
        int[] showTimes = {630, 540, 750, 600, 690}; 

        BubbleSort bs = new BubbleSort();
        bs.sort(showTimes);

        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}
