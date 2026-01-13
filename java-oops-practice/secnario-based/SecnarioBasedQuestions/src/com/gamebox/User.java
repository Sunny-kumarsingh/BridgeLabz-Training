package com.gamebox;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased: " + game.getTitle());
    }

    public void showOwnedGames() {
        System.out.println("🎯 Games owned by " + username + ":");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle());
        }
    }
}
