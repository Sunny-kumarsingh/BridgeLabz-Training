package com.gamebox;
public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download() {
        System.out.println("Downloading arcade game: " + title);
    }

    @Override
    public void playDemo() {
        System.out.println("Arcade Demo: Fast-paced action for 2 minutes!");
    }
}
