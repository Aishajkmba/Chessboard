public class Main {

    public static void main(String[] args) {
	System.out.println("Welcome to chess");
    Piece test = new Piece(0,0,true);
    System.out.println(test.getPositon()+"is"+test.getSymbol());
    test = new Piece("C3",false);
    System.out.println(test.getPositon()+"is"+test.getSymbol());
    }
}
