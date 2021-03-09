/**
 * Files: ChessPiece.java (and all subclasses), GameBoard.java,
 *        and RuleBook.java (however many there are)
 *
 * The main class for Project-Chess. Contains the main method for when the
 * game is launched.
 *
*/
public class MasterBoard {

   /**
    * Sets up the game board as well as all required pieces.
    *
    * @param TBD
    *
    */
    public static void initializer() {
        GameBoard gameBoard = new GameBoard();
        // TODO -----------------------------------
        return;
    }

    public static boolean unitTester() {
        ChessPiece[][] board1 = new ChessPiece[8][8];
        BlackPawn blackpawn1 = new BlackPawn(6, 0);
        if (!blackpawn1.canMove(board1)) {
            return false;
        }

        BlackPawn blackpawn2 = new BlackPawn(0, 0);
        blackpawn2.canMove(board1);
        if (!blackpawn2.canMove(board1)) {
            return false;
        }

        BlackPawn blackpawn3 = new BlackPawn(2, 1);
        blackpawn3.canMove(board1);
        if (!blackpawn3.canMove(board1)) {
            return false;
        }
        return true;
    }

    // The main method for once the game is launched
    public static void main(String[] args) {
        System.out.println("Testing all Units...");
        System.out.println();
        if (!MasterBoard.unitTester()) {
            System.out.println("Unit Test Failed!");
        }
        System.out.println("Unit Test Complete!");
        System.out.println();
        System.out.println("Initializing...");
        MasterBoard.initializer();


    }
}
