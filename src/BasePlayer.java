public abstract class BasePlayer {

    private String name;
    private int lostCount;
    private int winsCount;

    public BasePlayer(String name) {
        this.name = name;
        this.lostCount = 0;
        this.winsCount = 0;
    }

    public String getPlayerName() {
        return name;
    }

    public int getLostCount() {
        return lostCount;
    }

    public int getWinsCount() {
        return winsCount;
    }

    public void win() {
        winsCount++;
    }

    public void loose() {
        lostCount++;
    }

    public abstract String getUserInput() throws Exception;
}
