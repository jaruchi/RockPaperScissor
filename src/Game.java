import java.util.Scanner;

import static java.lang.System.exit;

public class Game {

    public void start(){
        String input = getUserInput();
        processInput(input);
    }

    public void render(){

        String s="=== Let' Play === " +
                "1. Computer" +
                "2. Multiplayer" +
                "";
        System.out.println(s);
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose player from options: ");
        String userInput = scanner.nextLine().toLowerCase();
        //scanner.close();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return input.equals("player") || input.equals("computer") || input.equals("quit");
    }

    public void startGame(){

    }

    public void processInput(String input) {
        switch (input) {
            case "player":
                //get player info
                startGame(new HumanPlayer(), new HumanPlayer());
                break;
            case "computer":
                startGame(new HumanPlayer(), new ComputerPlayer());
                break;
            default:
                System.out.println("Going back to main menu.");
                //exit(0);
        }

    }
}
