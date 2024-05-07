public class Pawn extends ConcretePiece{

    //data
    private int numOfEatenPieces;

    //constructor
    public Pawn(Player owner){
        this.numOfEatenPieces = 0;
        this.type = "\u265F"; // Unicode character ♟ for pawn
        this.owner = owner;
    }

    //functions
    public String getType(){
        return this.type;
    }

}
