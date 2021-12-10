import java.lang.constant.Constable;
import java.util.Scanner;

import static java.lang.System.exit;

public class Player {

    private  String name;
    
    public Player(String name){
        this.name=name;
    }
    public String getPlayerName(){
        return name;
    }
    public void render() {
        System.out.println("Type 'rock', 'paper', or 'scissors' to play.\n" +
                "Type 'quit' to go back to the main menu.");
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(this.name+" - your choice: ");
        String userInput = scanner.nextLine().toLowerCase();
        //scanner.close();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors")|| input.equals("quit");
    }

}
