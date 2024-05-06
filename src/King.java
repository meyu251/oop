public class King extends ConcretePiece{

    //data

    //constructor
    public King(Player owner){
        this.type = "King";
        this.owner = owner;
    }

    //functions
    public String getType(){
        return this.type;
    }
}
