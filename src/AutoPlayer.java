import java.util.ArrayList;

public class AutoPlayer extends Player{
    private final String R="rock";
    private final String S="scissors";
    private final String P="paper";

    public AutoPlayer() {
        super("Computer");
    }

    @Override
    public String getUserInput() {
        int c=(int)Math.floor(Math.random()*3.0);
         String[] choices= {R,S,P};
        System.out.println("Computer choice: "+ choices[c]);
         return choices[c];
    }

    @Override
    public void render() {
        System.out.println(this.getPlayerName() + " is choosing...");
    }

}
