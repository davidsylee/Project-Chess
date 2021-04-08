/**
 * Master class: MasterBoard.java
 *
 * Superclass files: ChessPiece.java
 *
 * This file contains instance attributes and methods for Knight pieces.
 * Knights can move any one space around them and then one diagonal space
 * from there to the left or right.
 *
*/
public class Knight extends ChessPiece {

    private static String name = "Knight";

    // The constructor for a Knight piece
    public Knight(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
    }

    @Override
    public boolean canMove(GameBoard board, int row, int col) {
        

    }

}
