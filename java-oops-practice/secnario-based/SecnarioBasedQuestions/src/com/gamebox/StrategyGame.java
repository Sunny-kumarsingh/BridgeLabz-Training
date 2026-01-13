package com.gamebox;
public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println("?? Downloading strategy game: " + title);
    }

    @Override
    public void playDemo() {
        System.out.println("? Strategy Demo: Play first mission with limited features!");
    }
}
