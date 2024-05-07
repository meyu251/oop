public class GameLogic implements PlayableLogic{

    //data
    private Piece[][] board;
    private ConcretePlayer player1 = new ConcretePlayer(1);     //Defender
    private ConcretePlayer player2 = new ConcretePlayer(2);     //Attacker


    //constructor
    public GameLogic(){

        board = new Piece[11][11];

        setPlayer1Pieces();
        setPlayer2Pieces();

    }

    private void setPlayer1Pieces() {

        for (int row = 3; row <= 7; row++) {
            if(row==5) {
                for (int col = 3; col <= 7; col++) {
                    board[row][col] = new Pawn(player1);
                }
                board[5][5] = new King(player1);
            }
            else if(row%2 == 1) {board[row][5] = new Pawn(player1);}
            else {
                for (int col = 4; col <= 6; col++) {
                    board[row][col] = new Pawn(player1);
                }
            }
        }
    }

    private void setPlayer2Pieces() {

        for (int col = 3; col <= 7; col++) {
            board[col][0] = new Pawn(player2);
        }
        for (int col = 3; col <= 7; col++) {
            board[col][10] = new Pawn(player2);
        }
        for (int row = 3; row <= 7; row++) {
            board[0][row] = new Pawn(player2);
        }
        for (int row = 3; row <= 7; row++) {
            board[10][row] = new Pawn(player2);
        }
        board[1][5] = new Pawn(player2);
        board[9][5] = new Pawn(player2);
        board[5][1] = new Pawn(player2);
        board[5][9] = new Pawn(player2);
    }


    //functions
    @Override
    public boolean move(Position a, Position b) {

        int aRow = a.getRow();
        int aCol = a.getCol();
        int bRow = b.getRow();
        int bCol = b.getCol();

        if(aRow==bRow && aCol==bCol){return false;}
        if(aRow!=bRow && aCol!=bCol){return false;}

        if(aRow==bRow){
            for (int i = aCol; i <= bCol; i++) {

            }
        }
        else{
            for (int i = aRow; i <= bRow; i++) {

            }
        }

        return false;
    }

    @Override
    public Piece getPieceAtPosition(Position position) {
        return board[position.getRow()][position.getCol()];
    }

    @Override
    public Player getFirstPlayer() {
        return player1;
    }

    @Override
    public Player getSecondPlayer() {
        return player2;
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
        return 11;
    }
}
