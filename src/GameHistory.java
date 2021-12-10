import java.util.Scanner;

public class GameHistory {

    public void start(){
        String input = getUserInput();
        processInput(input);
    }

    public void render(){

        String s="=== GAME HISTORY ===\n" +
                "WIN: Player picked rock, computer picked scissors\n" +
                "LOSS: Player picked paper, computer picked scissors";
        System.out.println(s);
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to conitnue ");
        String userInput = scanner.nextLine().toLowerCase();
        //scanner.close();
        if (!validateUserInput(userInput)) {
            System.out.println("Please provide a valid input...");
            userInput = getUserInput();
        }
        return userInput;
    }

    public boolean validateUserInput(String input) {
        return true;
    }

    public void processInput(String input) {

    }
}
