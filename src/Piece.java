public class Piece {
    private int row;
    private int column;
    private boolean isBlack;
    protected char symbol;

    public Piece(int row, int column, boolean isBlack) {
        this.row = row;
        this.column = column;
        this.isBlack = isBlack;
        symbol = 'x'; //dummy symbol
    }
    public Piece(String position,boolean isBlack) {
        this.isBlack = isBlack;
        symbol = 'x';
        row = getRowFromPosition(position);
        column = getColumnFromPosition(position);
    }
    //e.g for a position AB return row number 7
    private int getRowFromPosition(String p){
        char posChar = p.toCharArray()[1]; // "A8 ->'8
        int rowNumber = Character.getNumericValue(posChar)// '8'->8
        return rowNumber -1;
    }
    //e.g for position AB return column 0
    private int getColumnFromPosition(String p){
      char colChar = p.toCharArray()[0];
       int asciValue = colChar;
       int colNumber = asciValue - (int)'A'; // A to B
       return colNumber;
}

    public char getSymbol() {
        if (isBlack) {
            return Character.toUpperCase(symbol);
        }
        return Character.toLowerCase(symbol);
    }

    public String getPosition(){ return Chessutils.columnToLetter(column);

        public boolean isValidMove(String targetPosition) {
            return true;
        }
    }
}



