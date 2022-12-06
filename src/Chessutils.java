public class Chessutils {
    public static int getColumnFromPosition(String p){
        char colChar = p.toCharArray()[0];
        int asciValue = colChar;
        int colNumber = asciValue - (int)'A'; // A to B
        return colNumber;
    }

    public static int getRowFromPosition(String position) {
        return 0;
    }


    // eg 0->A 1->B etc
    public String columnToLetter(int c) {
        char letter = (char)('A' + c);
        return Character.toString(letter);
    }

    // eg 0 -> "1", 1 -> "2" etc
    public String rowToNumber(int r) {
        return Integer.toString(r+1);
    }


}


