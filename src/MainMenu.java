import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu {
    private  GameHistory history ;

    public MainMenu(){
        history=new GameHistory();
    }
    public void start(){
        String input = getUserInput();
        processInput(input);
    }

    public void render() {
        System.out.println("Welcome to Rock, Paper, Scissors!\n" +
                "\n" +
                "MAIN MENU\n" +
                "=====\n" +
                "1. Type 'play' to play.\n" +
                "2. Type 'history' to view your game history.\n" +
                "3. Type 'quit' to stop playing.");
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you option: ");
        String userInput = scanner.nextLine().toLowerCase();
        //scanner.close();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return input.equals("play") || input.equals("history") || input.equals("quit");
    }

    public void processInput(String input) {
        switch (input) {
            case "play":
                Game game = new Game(history);
                game.render();
                game.start();
                render();
                start();
                break;
            case "history":
                history.render();
                history.start();
                render();
                start();
                break;
            default:
                System.out.println("Thanks for playing!!!Quiting the game.");
                exit(0);
        }

    }
}
