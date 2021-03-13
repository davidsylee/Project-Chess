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
public class WhitePawn extends ChessPiece {

    private static String name = "Pawn";

    // The constructor for a Pawn piece
    public WhitePawn(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
        // Poor guy... You'll probably die asap.
    }

    @Override
    public boolean canMove(GameBoard board) {
        // When there is an open space in front of the Pawn
        if ((rowPos + 1 < board.length()) &&
            (board.getPos(rowPos + 1, colPos) == null)) {
            return true;
        }

        // When there is an enemy to the diagonal left of the piece
        else if ((rowPos + 1 < board.length()) && (colPos - 1 >= 0) &&
                 (board.getPos(rowPos + 1, colPos - 1) != null)) {
            return true;
        }

        // When there is an enemy to the diagonal right of the piece
        else if ((rowPos + 1 < board.length()) && (colPos + 1 < board.length()) &&
                 (board.getPos(rowPos + 1, colPos + 1) != null)) {
            return true;
        }
        return false;
    }
}
