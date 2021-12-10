import java.util.Scanner;

import static java.lang.System.exit;

public class Game {

    private final String R = "rock";
    private final String S = "scissors";
    private final String P = "paper";

    private GameHistory history;

    public Game(GameHistory history) {
        this.history = history;
    }

    public void start() {
        String input = getUserInput();
        processInput(input);
    }

    public void render() {

        String s = "=== Let' Play === \n" +
                "1. Computer\n" +
                "2. Multiplayer\n" +
                "";
        System.out.println(s);
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type player choice: ");
        String userInput = scanner.nextLine().toLowerCase();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public void pressAnyKeyToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        scanner.nextLine();
    }

    public boolean validateUserInput(String input) {
        return input.equals("player") || input.equals("computer") || input.equals("quit");
    }

    private void play(Player p1, Player p2) {
        p1.render();
        String i1 = p1.getUserInput();
        p2.render();
        String i2 = p2.getUserInput();

        if (i1.equals(i2))
            history.draw(p1, p2);
        else if (i1.equals(R)) {
            if (i2.equals(S)) history.win(p1, p2);
            else history.win(p2, p1);
        } else if (i1.equals(S)) {
            if (i2.equals(P)) history.win(p1, p2);
            else history.win(p2, p1);
        } else {
            if (i2.equals(R)) history.win(p1, p2);
            else history.win(p2, p1);
        }
    }

    public void processInput(String input) {
        switch (input) {
            case "player":
                //get player info
                play(new Player("Player 1"), new Player("Player 2"));
                pressAnyKeyToContinue();
                break;
            case "computer":
                play(new Player("Player"), new AutoPlayer());
                pressAnyKeyToContinue();
                break;
            default:
                System.out.println("Going back to main menu.");
                //exit(0);
        }
        System.out.println("----x-x-x-x-x-x---Thanks for playing---x-x-x-x-x-x----");
    }
}
