import java.util.Scanner;

import static java.lang.System.exit;

public class MainMenu extends Display {

    Player userPlayer1;
    Player userPlayer2;
    Player computer;


    public MainMenu() {
        this.userPlayer1 = new Player("Player 1");
        this.userPlayer2 = new Player("Player 2");
        this.computer = new AutoPlayer();
        this.message = "Enter you option: ";
    }

    public void start() {
        String input = getUserInput();
        processInput(input);
    }

    @Override
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

    @Override
    public boolean validateUserInput(String input) {
        return input.equals("play") || input.equals("history") || input.equals("quit");
    }

    public void processInput(String input) {
        switch (input) {
            case "play":
                Game game = new Game(userPlayer1, userPlayer2, computer);
                game.render();
                game.start();
                render();
                start();
                break;
            case "history":
                GameHistory history = new GameHistory();
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
