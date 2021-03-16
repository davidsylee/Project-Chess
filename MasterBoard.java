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
        GameBoard board = new GameBoard();
        // TODO -----------------------------------
        return;
    }

    public static boolean unitTester() {
        boolean compatability = true;
        if (!BlackPawnTester.blackPawnTester()) {
            compatability = false;
        }
        if (!WhitePawnTester.whitePawnTester()) {
            compatability = false;
        }
        if (!BishopTester.bishopTester()) {
            compatability = false;
        }
        return compatability;
    }

    // The main method for once the game is launched
    public static void main(String[] args) {
        System.out.println("Testing all Units...");
        System.out.println();
        if (!MasterBoard.unitTester()) {
            System.out.println();
            System.out.println("Unit Test Failed!");
            return;
        }
        System.out.println();
        System.out.println("Unit Test Complete!");
        System.out.println();
        System.out.println("Initializing...");
        MasterBoard.initializer();


    }
}
