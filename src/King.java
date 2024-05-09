public class King extends ConcretePiece{

    //data

    //constructor
    public King(Player owner){
        super(owner);
        this.type = "\u265A"; //Unicode character ♚ for king
    }

    //functions
    public String getType(){
        return this.type;
    }
}
