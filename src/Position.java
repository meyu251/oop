public class Position {

    //data
    private int row;
    private int col;
    private boolean empty = true;
//    private ConcretePiece piece = null;

    //constructor
    public Position(int x, int y){
        this.row = x;
        this.col = y;
    }

    //functions
    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public boolean isEmpty(){
        return this.empty;
    }

//    public ConcretePiece getPiece() {
//        return this.piece;
//    }
//
//    public void setPiece(ConcretePiece piece){
//        this.piece = piece;
//    }
}
