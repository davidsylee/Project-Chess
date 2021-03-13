/**
 * Master class: MasterBoard.java
 *
 * Superclass files: WhitePawn.java
 *
 * This file contains the tester method for WhitePawn instances.
 *
*/
public class WhitePawnTester {

    // Tests whether the WhitePawn canMove method works.
    public static boolean whitePawnTester() {
        System.out.println("Loading WhitePawnTester...");

        // Creates a test board
        GameBoard board = new GameBoard();

        // Checks if the WhitePawn can move forward to an empty space
        WhitePawn whitepawn1 = new WhitePawn(6, 0);
        if (!whitepawn1.canMove(board)) {
            System.out.println("Failure on test 1");
            return false;
        }

        // Checks if the WhitePawn is restricted after reaching border
        WhitePawn whitepawn2 = new WhitePawn(7, 0);
        if (whitepawn2.canMove(board)) {
            System.out.println("Failure on test 2");
            return false;
        }

        // Checks if the WhitePawn can move diagonally toward enemy
        WhitePawn whitepawn3 = new WhitePawn(1, 2);
        BlackPawn enemypawn = new BlackPawn(2, 1);
        if (!whitepawn3.canMove(board)) {
            System.out.println("Failure on test 3");
            return false;
        }
        return true;
    }
}
