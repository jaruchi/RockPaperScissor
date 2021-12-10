import java.util.ArrayList;
import java.util.Scanner;

public class GameHistory {

    ArrayList<String> gamesHistory;

    public GameHistory(){
        this.gamesHistory = new ArrayList<>();
    }

    public void draw(Player p1,Player p2){
        gamesHistory.add("Draw");
        System.out.println("Draw ");
    }

    public void win(Player p1,Player p2){
        gamesHistory.add("Win");
        System.out.println("Win: "+ p1.getPlayerName());
    }


    public void start(){
        pressAnyKeyToContinue();
    }

    public void render(){
        String s="=== GAME HISTORY ===\n";
        System.out.println(s);
        for (String message: gamesHistory) {
            System.out.println(message);

        }
    }

    public void pressAnyKeyToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        scanner.nextLine();
    }

    public String getUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to conitnue ");
        String userInput = scanner.nextLine();
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
