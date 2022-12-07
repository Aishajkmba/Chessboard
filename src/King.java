public class  King extends Piece{
    private boolean inCheck;


    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }
    //kings can move in 1 square in any direction
    public boolean isValidMove(String targetPositon){
    //convert position to row and column
        int startRow = Chessutils.getRowFromPosition(getPosition());
        int startColumn = Chessutils.getColumnFromPosition(getPosition());
        int targetRow = Chessutils.getRowFromPosition(targetPositon);
        int targetColumn = Chessutils.getColumnFromPosition(targetPositon);
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
