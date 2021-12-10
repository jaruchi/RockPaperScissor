import java.util.ArrayList;
import java.util.Scanner;

public class GameHistory {

    private static ArrayList<String> gameHistoryList = new ArrayList<>();

    public GameHistory(){
           }

    public static void draw(Player p1,Player p2, String input1, String input2){
        gameHistoryList.add("Draw: "+ p1.getPlayerName() + " picked "+ input1 + "," + p2.getPlayerName() + " picked "+ input2);
        System.out.println();
        System.out.println("Draw ");
        System.out.println();
    }

    public static void win(Player p1,Player p2, String input1, String input2){
        String playerDisplay = p1.getPlayerName() + " ("+p1.getWinsCount()+"/"+p1.getLostCount()+")";
        gameHistoryList.add("Win: ["+ playerDisplay+"] "+ p1.getPlayerName() + " picked "+ input1 + "," + p2.getPlayerName() + " picked "+ input2);
        System.out.println();
        System.out.println("Winner: "+ p1.getPlayerName());
        System.out.println();
    }


    public void start(){
        pressAnyKeyToContinue();
    }

    public void render(){
        System.out.println();
        String s="=== GAME HISTORY ===\n";
        System.out.println(s);
        for (String message: gameHistoryList) {
            System.out.println(message);

        }
    }

    public void pressAnyKeyToContinue() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        scanner.nextLine();
    }

    public String getUserInput() {

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to conitnue ");
        String userInput = scanner.nextLine();
        if (!validateUserInput(userInput)) {
            System.out.println();
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
