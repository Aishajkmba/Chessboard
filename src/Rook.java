public class Rook extends Piece {
    private boolean inCheck;


    public Rook(String position, boolean isBlack) {
        super(position, isBlack);
        symbol = 'R';
        inCheck = false;

    }
    public boolean isValidMove(String targetPosition){
        //convert position to row and column
        int startRow = Chessutils.getRowFromPosition(getPosition());
        int startColumn = Chessutils.getColumnFromPosition(getPosition());
        int targetRow = Chessutils.getRowFromPosition(targetPosition);
        int targetColumn = Chessutils.getColumnFromPosition(targetPosition);
        // can't stand still
        if(targetRow == startRow && targetColumn == startColumn){
            return false;
        }
        //can't move more than one square in any direction
        if (Math.abs(startRow-targetRow) > 1) {
            return false;
        }
        return true;
    }

}
