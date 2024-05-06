public class GameLogic implements PlayableLogic{

    //data
    private Position[][] board = new Position[11][11];
    private ConcretePlayer player1 = new ConcretePlayer(1);     //Attacker
    private ConcretePlayer player2 = new ConcretePlayer(2);     //Defender


    //constructor
    public GameLogic(){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                board[col][row] = new Position(col+1, row+1);
            }
        }

        setPlayer1Pieces();
        setPlayer2Pieces();

    }

    private void setPlayer1Pieces() {

        for (int row = 3; row <= 7; row++) {
            if(row==5) {
                for (int col = 3; col <= 7; col++) {
                    board[row][col].setPiece(new Pawn(player1));
                }
                board[5][5].setPiece(new King(player1));
            }
            else if(row%2 == 1) {board[row][5].setPiece(new Pawn(player1));}
            else {
                for (int col = 4; col <= 6; col++) {
                    board[row][col].setPiece(new Pawn(player1));
                }
            }
        }

    }

    private void setPlayer2Pieces() {

        for (int col = 3; col <= 7; col++) {
            board[0][col].setPiece(new Pawn(player2));
        }
        for (int col = 3; col <= 7; col++) {
            board[10][col].setPiece(new Pawn(player2));
        }
        for (int row = 3; row <= 7; row++) {
            board[row][0].setPiece(new Pawn(player2));
        }
        for (int row = 3; row <= 7; row++) {
            board[row][10].setPiece(new Pawn(player2));
        }
        board[1][5].setPiece(new Pawn(player2));
        board[9][5].setPiece(new Pawn(player2));
        board[5][1].setPiece(new Pawn(player2));
        board[5][9].setPiece(new Pawn(player2));

    }


    //functions
    @Override
    public boolean move(Position a, Position b) {
//        if(b.getPiece()!=null){return false;}
//        if(a.getX()!=b.getX() && a.getY()!=b.getY()){return false;}


    }

    @Override
    public Piece getPieceAtPosition(Position position) {
        return position.getPiece();
    }

    @Override
    public Player getFirstPlayer() {
        return null;
    }

    @Override
    public Player getSecondPlayer() {
        return null;
    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public boolean isSecondPlayerTurn() {
        return false;
    }

    @Override
    public void reset() {

    }

    @Override
    public void undoLastMove() {

    }

    @Override
    public int getBoardSize() {
        return 0;
    }
}
