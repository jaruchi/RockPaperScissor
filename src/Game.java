import java.util.Scanner;

import static java.lang.System.exit;

public class Game {

    Player userPlayer1;
    Player userPlayer2;
    Player computer;

    private final String R = "rock";
    private final String S = "scissors";
    private final String P = "paper";


    public Game(Player userPlayer1, Player userPlayer2, Player computer) {
        this.userPlayer1 = userPlayer1;
        this.userPlayer2 = userPlayer2;
        this.computer = computer;
    }

    public void start() {
        String input = getUserInput();
        processInput(input);
    }

    public void render() {

        String s = "=== Let' Play === \n" +
                "1. Type Computer to play against Computer\n" +
                "2. Type Player to play again another Player\n" +
                "";
        System.out.println();
        System.out.println(s);
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
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
            GameHistory.draw(p1, p2, i1, i2);
        else if (i1.equals(R)) {
            if (i2.equals(S)){
                p1.win();
                p2.loose();
                GameHistory.win(p1, p2, i1, i2);
            } else{
                p2.win();
                p1.loose();
                GameHistory.win(p2, p1, i2, i1);
            }
        } else if (i1.equals(S)) {
            if (i2.equals(P)) {
                p1.win();
                p2.loose();
                GameHistory.win(p1, p2, i1, i2);
            } else{
                p2.win();
                p1.loose();
                GameHistory.win(p2, p1, i2, i1);
            }
        } else {
            if (i2.equals(R)) {
                p1.win();
                p2.loose();
                GameHistory.win(p1, p2, i1, i2);
            } else{
                p2.win();
                p1.loose();
                GameHistory.win(p2, p1, i2, i1);
            }
        }
    }

    public void processInput(String input) {
        switch (input) {
            case "player":
                //get player info
                play( userPlayer1, userPlayer2);
                break;
            case "computer":
                play(userPlayer1, computer);
                break;
            default:
                System.out.println("Going back to main menu.");
        }
        System.out.println();
        System.out.println("----x-x-x-x-x-x---Thanks for playing---x-x-x-x-x-x----");
        System.out.println();
        pressAnyKeyToContinue();
    }
}
