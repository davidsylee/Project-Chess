/**
 * Master class: MasterBoard.java
 *
 * Superclass files: BlackPawn.java
 *
 * This file contains the tester method for BlackPawn instances.
 *
*/
public class BlackPawnTester {

    // Tests whether the BlackPawn canMove method works.
    public static boolean blackPawnTester() {
        System.out.println("Loading BlackPawnTester...");

        // Creates a test board
        GameBoard board = new GameBoard();

        // Checks if the BlackPawn can move forward to an empty space
        BlackPawn blackpawn1 = new BlackPawn(6, 0);
        if (!blackpawn1.canMove(board)) {
            System.out.println("Failure on test 1");
            return false;
        }

        // Checks if the BlackPawn is restricted after reaching border
        BlackPawn blackpawn2 = new BlackPawn(0, 0);
        if (blackpawn2.canMove(board)) {
            System.out.println("Failure on test 2");
            return false;
        }

        // Checks if the BlackPawn can move diagonally toward enemy
        BlackPawn blackpawn3 = new BlackPawn(2, 1);
        WhitePawn enemypawn = new WhitePawn(1, 2);
        if (!blackpawn3.canMove(board)) {
            System.out.println("Failure on test 3");
            return false;
        }
        return true;
    }
}
