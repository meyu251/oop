public class ConcretePlayer implements Player{

    //data
    private int playerNum;
    private int numOfWins = 0;

    //constructor
    public ConcretePlayer(int playerNum){
        this.playerNum = playerNum;
    }

    //functions
    @Override
    public boolean isPlayerOne() {
        return playerNum == 1;
    }

    @Override
    public int getWins() {
        return numOfWins;
    }

}
