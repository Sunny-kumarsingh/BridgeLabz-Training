//Rock - Paper-Scissors 

import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner of a single game
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate wins and winning percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    // Method to display game results and final stats
   public static void displayResults(String[][] gameResults, String[][] stats) {

    System.out.println("\nGame Results:");
    System.out.printf("%-6s %-12s %-12s %-10s%n",
            "Game", "User", "Computer", "Winner");

    for (int i = 0; i < gameResults.length; i++) {
        System.out.printf("%-6d %-12s %-12s %-10s%n",
                (i + 1),
                gameResults[i][0],
                gameResults[i][1],
                gameResults[i][2]);
    }

    System.out.println("\nFinal Statistics:");
	System.out.printf("%-10s %-8s %-10s%n",
            "Player", "Wins", "Win %");

    for (int i = 0; i < stats.length; i++) {
        System.out.printf("%-10s %-8s %-10s%n",
                stats[i][0],
                stats[i][1],
                stats[i][2] + "%");
    }
}
    public static void main(String[] args) {
        // Create Object of Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of games:");
        int games = sc.nextInt();

        String[][] gameResults = new String[games][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")){
                userWins++;
            }else if (winner.equals("Computer")){
                computerWins++;
            }
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(gameResults, stats);
    }
}