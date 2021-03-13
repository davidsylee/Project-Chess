/**
 * Master class: MasterBoard.java
 *
 * Superclass files: ChessPiece.java
 *
 * This file contains instance attributes and methods for Bishop pieces.
 * Bishops move diagonally until they reach the end of the chess board or
 * come in contact with another ChessPiece.
 *
*/
public class Bishop extends ChessPiece {

    private static String name = "Bishop";

    // The constructor for a Pawn piece
    public Bishop(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
    }

    @Override
    public boolean canMove(GameBoard board) {
        // Moves diagonally until the piece reaches the end or a ChessPiece
        while (true) {
            if ((rowPos + 1 < board.length()) && (colPos + 1 < board.length()) &&
                (board.getPos(rowPos + 1, colPos + 1) == null)) {
                return true;
            }
            else if ((rowPos - 1 >= 0) && (colPos - 1 >= 0) &&
                (board.getPos(rowPos - 1, colPos - 1) == null)) {
                return true;
            }
            else if ((rowPos + 1 < board.length()) && (colPos - 1 >= 0) &&
                (board.getPos(rowPos + 1, colPos - 1) == null)) {
                return true;
            }
            else if ((rowPos - 1 >= 0) && (colPos + 1 < board.length()) &&
                (board.getPos(rowPos - 1, colPos + 1) == null)) {
                return true;
            }
            else {
                break;
            }
        }
        return false;
    }

}
