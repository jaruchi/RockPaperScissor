import java.util.ArrayList;
import java.util.Scanner;

public class GameHistory extends Display {

    private static ArrayList<String> gameHistoryList = new ArrayList<>();

    public GameHistory() {
        this.message = "";
    }

    public static void draw(Player p1, Player p2, String input1, String input2) {
        gameHistoryList.add("Draw: " + p1.getPlayerName() + " picked " + input1 + "," + p2.getPlayerName() + " picked " + input2);
        System.out.println();
        System.out.println("Draw ");
        System.out.println();
    }

    public static void win(Player p1, Player p2, String input1, String input2) {
        String playerDisplay = p1.getPlayerName() + " (" + p1.getWinsCount() + "/" + p1.getLostCount() + ")";
        gameHistoryList.add("Win: [" + playerDisplay + "] " + p1.getPlayerName() + " picked " + input1 + "," + p2.getPlayerName() + " picked " + input2);
        System.out.println();
        System.out.println("Winner: " + p1.getPlayerName());
        System.out.println();
    }

    @Override
    public void start() {
        pressAnyKeyToContinue();
    }

    @Override
    public void render() {
        System.out.println();
        String s = "=== GAME HISTORY ===\n";
        System.out.println(s);
        for (String message : gameHistoryList) {
            System.out.println(message);

        }
    }

}
