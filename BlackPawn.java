/**
 * Master class: MasterBoard.java
 *
 * Superclass files: ChessPiece.java
 *
 * This file contains instance attributes and methods for Pawn pieces.
 * Only WhitePawn and BlackPawn require separate classes for each because
 * they have restricted vertical movement.
 *
*/
public class BlackPawn extends ChessPiece {

    private static String name = "Pawn";

    // The constructor for a Pawn piece
    public BlackPawn(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
        // Poor guy... You'll probably die asap.
    }

    @Override
    public boolean canMove(GameBoard board, int row, int col) {
        // When there is an open space in front of the Pawn
        if ((row >= 0) && (board.getPos(row, col) == null) &&
            (rowPos - 1 == row) && (colPos == col)) {
            return true;
        }

        // When there is an enemy to the diagonal left of the piece
        else if ((row >= 0) && (col >= 0) &&
                 (board.getPos(row, col) != null) &&
                 (rowPos - 1 == row) && (colPos - 1 == col)) {
            return true;
        }

        // When there is an enemy to the diagonal right of the piece
        else if ((row >= 0) && (col < board.length()) &&
                 (board.getPos(row, col) != null) &&
                 (rowPos - 1 == row) && (colPos + 1 == col)) {
            return true;
        }
        return false;
    }
}
