package com.gamebox;
public class GameBoxApp {

    public static void main(String[] args) {

        Game arcade = new ArcadeGame("Speed Racer", 299, 4.5);
        Game strategy = new StrategyGame("War Planner", 499, 4.7);

        // Free demo
        arcade.playDemo();
        strategy.playDemo();

        // Apply seasonal offer
        arcade.applySeasonalOffer(100);
        strategy.applySeasonalOffer(150);

        System.out.println("Arcade Price after offer: " + arcade.getPrice());
        System.out.println("Strategy Price after offer: " + strategy.getPrice());

        User user = new User("Sunny");

        arcade.download();
        user.purchaseGame(arcade);

        strategy.download();
        user.purchaseGame(strategy);

        user.showOwnedGames();
    }
}
