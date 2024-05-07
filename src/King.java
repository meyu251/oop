public class King extends ConcretePiece{

    //data

    //constructor
    public King(Player owner){
        this.type = "\u265A"; //Unicode character ♚ for king
        this.owner = owner;
    }

    //functions
    public String getType(){
        return this.type;
    }
}
