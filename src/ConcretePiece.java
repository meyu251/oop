import java.lang.reflect.Type;

public abstract class ConcretePiece implements Piece{

    //data
    protected Player owner;
    protected String type;

    //constructor
    public ConcretePiece(Player owner){
        this.owner = owner;
    }

    //functions
    @Override
    public Player getOwner() {
        return this.owner;
    }

    @Override
    public abstract String getType();
}
