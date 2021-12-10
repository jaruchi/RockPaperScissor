import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu {

    Player userPlayer1;
    Player userPlayer2;
    Player computer;


    public MainMenu(){
        this.userPlayer1 = new Player("Player 1");
        this.userPlayer2 = new Player("Player 2");
        this.computer = new AutoPlayer();
    }

    public void start(){
        String input = getUserInput();
        processInput(input);
    }

    public void render() {
        System.out.println();

        System.out.println("Welcome to Rock, Paper, Scissors!\n" +
                "\n" +
                "MAIN MENU\n" +
                "=====\n" +
                "1. Type 'play' to play.\n" +
                "2. Type 'history' to view your game history.\n" +
                "3. Type 'quit' to stop playing.");
    }

    public String getUserInput() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you option: ");
        String userInput = scanner.nextLine().toLowerCase();
        System.out.println();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            System.out.println();
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
                Game game = new Game(userPlayer1,userPlayer2,computer);
                game.render();
                game.start();
                render();
                start();
                break;
            case "history":
                GameHistory history  =new GameHistory();
                history.render();
                history.start();
                render();
                start();
                break;
            default:
                System.out.println("Quiting the game.");
                exit(0);
        }

    }
}
