import java.lang.constant.Constable;
import java.util.Scanner;

import static java.lang.System.exit;

public class Player extends BasePlayer{

    public Player(String name) {
        super(name);
    }

    public void render() {
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.");
        System.out.println();
    }

    @Override
    public String getUserInput() throws Exception {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print(this.getPlayerName()+" - your choice: ");
        String userInput = scanner.nextLine().toLowerCase();
        if (!validateUserInput(userInput)) {

            throw new Exception( );
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }

}
