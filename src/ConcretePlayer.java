public class ConcretePlayer implements Player{

    //data
    private int playerNum;
    private int numOfWins = 0;

    //constructor
    public ConcretePlayer(int playerNum){
//        @TODO handle invalid value
//        if(playerNum != 1 && playerNum != 2){
//            System.out.println("invalid number for playernum");
//            return ;
//        }
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
