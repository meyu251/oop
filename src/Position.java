public class Position {

    //data
    private int x;
    private int y;
    private boolean empty = true;
    private ConcretePiece piece = null;

    //constructor
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    //functions
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public boolean isEmpty(){
        return this.empty;
    }

    public ConcretePiece getPiece() {
        return this.piece;
    }

    public void setPiece(ConcretePiece piece){
        this.piece = piece;
    }
}
