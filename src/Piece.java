public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    protected char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x';  // dummy symbol - shouldn't ever appear on the board
    }

    public Piece(String position, boolean isBlack) {
        this.isBlack = isBlack;
        symbol = 'x';
        row = Chessutils.getRowFromPosition(position);
        column = Chessutils.getColumnFromPosition(position);
    }


    public char getSymbol() {
        if (isBlack) {
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }

    // convert row and column values to chess Notation eg 0,0 -> A1
    public String getPosition() {
        return Chessutils.columnToLetter(column) + Chessutils.rowToNumber(row);
    }

    // set a new position for the piece
    public void setPosition(String newPosition) {
        int startPosition = Chessutils.getRowFromPosition(newPosition);


    }
    public boolean isValidMove(String targetPosition) {
        return true;
    }


    }







