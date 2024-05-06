import java.lang.reflect.Type;

public abstract class ConcretePiece implements Piece{

    //data
    protected Player owner;
    protected String type;

    //functions
    @Override
    public Player getOwner() {
        return this.owner;
    }

    @Override
    public abstract String getType();
}
