public class ConcretePlayer implements Player{

    private short playerNum;
    private short numOfWins = 0;

    public ConcretePlayer(short playerNum){
//        @TODO handle invalid value
//        if(playerNum != 1 && playerNum != 2){
//            System.out.println("invalid number for playernum");
//            return ;
//        }
        this.playerNum = playerNum;
    }

    @Override
    public boolean isPlayerOne() {
        return playerNum == 1;
    }

    @Override
    public int getWins() {
        return numOfWins;
    }

}
