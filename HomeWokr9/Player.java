package HomeWokr9;

import java.util.Scanner;

public class Player {
    public String name;
    public Choice choice;

    public Player(String name) {
        this.name = name;
    }

    public Choice getChoice() {
        return choice;
    }

    public void inputChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " input your choice - ROCK, PAPER or SCISSORS ");
        String input = scanner.nextLine().toUpperCase();
        try {
            this.choice = Choice.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong choice. Choose ROCK, PAPER or SCISSORS");
            inputChoice();
        }
    }
}