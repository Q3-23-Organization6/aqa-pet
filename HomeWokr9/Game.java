package HomeWokr9;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.inputChoice();
        player2.inputChoice();

        Choice choice1 = player1.getChoice();
        Choice choice2 = player2.getChoice();

        System.out.println("Player 1 chose: " + choice1);
        System.out.println("Player 2 chose: " + choice2);

        if (choice1 == choice2) {
            System.out.println("Draw");
        } else if ((choice1 == Choice.ROCK && choice2 == Choice.SCISSORS) ||
                (choice1 == Choice.PAPER && choice2 == Choice.ROCK) ||
                (choice1 == Choice.SCISSORS && choice2 == Choice.PAPER)) {
            System.out.println("Player 1 won");
        } else {
            System.out.println("Player 2 won");
        }
            System.out.println("Want to play again? (yes/no)");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Thank you for the Game!");
    }
}