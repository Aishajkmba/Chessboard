public class  King extends Piece{
    private boolean inCheck;


    public King(String position, boolean isBlack){
        super(position, isBlack);
        symbol = 'K';
        inCheck = false;
    }
    //kings can move in 1 square in any direction
    public boolean isValidMove(String targetPositon){


    }

}
