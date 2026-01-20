package com.movietime;
public class Theater {

    private int[] showTimes;

    public Theater(int[] showTimes) {
        this.showTimes = showTimes;
    }

    public void addNewShow(int newShowTime) {

        int[] newArr = new int[showTimes.length + 1];

        for (int i = 0; i < showTimes.length; i++) {
            newArr[i] = showTimes[i];
        }

        newArr[newArr.length - 1] = newShowTime;

        showTimes = newArr;

        InsertionSort.sort(showTimes);
    }

    public void displayShows() {
        for (int time : showTimes) {
            System.out.print(time + " ");
        }
        System.out.println();
    }
}
