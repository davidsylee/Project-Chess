/**
 * Master class: MasterBoard.java
 *
 * Test file for: Bishop.java
 *
 * This file contains the tester method for Bishop instances.
 *
*/
public class BishopTester {

    // Tests whether the Bishop canMove method works.
    public static boolean bishopTester() {
        System.out.println("Loading BishopTester...");

        // Creates a test board
        GameBoard board = new GameBoard();

        // Checks if the Bishop can move diagonally to an empty space
        Bishop bishop1 = new Bishop(7, 0);
        if (!bishop1.canMove(board, 0, 7)) {
            System.out.println("Failure on test 1");
            return false;
        }

        // Checks if the Bishop is restricted after reaching border
        Bishop bishop2 = new Bishop(0, 0);
        if (bishop2.canMove(board, -1, -1)) {
            System.out.println("Failure on test 2");
            return false;
        }

        // Checks if the Bishop can move diagonally toward enemy
        Bishop bishop3 = new Bishop(0, 5);
        WhitePawn enemypawn = new WhitePawn(4, 1);
        board.setPos(enemypawn.getRow(), enemypawn.getCol(), enemypawn);
        if (!bishop3.canMove(board, 4, 1)) {
            System.out.println("Failure on test 3");
            return false;
        }
        return true;
    }
}
