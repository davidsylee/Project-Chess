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

    // The constructor for a Bishop piece
    public Bishop(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
    }

    @Override
    public boolean canMove(GameBoard board, int row, int col) {

        int rowDistance = rowPos - row;
        int colDistance = colPos - col;

        // Total distance the bishop is set to travel
        int moveCountRow = Math.abs(rowDistance);
        int moveCountCol = Math.abs(colDistance);

        // These XY counts determine which direction the bishop will move
        boolean RDcount = false;
        boolean LUcount = false;
        boolean LDcount = false;
        boolean RUcount = false;

        if ((rowDistance < 0) && (colDistance < 0)) {
            RDcount = true;
        }
        else if ((rowDistance > 0) && (colDistance > 0)) {
            LUcount = true;
        }
        else if ((rowDistance < 0) && (colDistance > 0)) {
            LDcount = true;
        }
        else if ((rowDistance > 0) && (colDistance < 0)) {
            RUcount = true;
        }

        int tempRow = rowPos;
        int tempCol = colPos;

        // Moves diagonally until the piece reaches the end or a ChessPiece
        while ((moveCountRow > 0) && (moveCountCol > 0)) {

            // To the diagonal right downward
            if ((tempRow < board.length()) && (tempCol < board.length()) &&
                (board.getPos(tempRow, tempCol) == null) && RDcount) {
                tempRow += 1;
                tempCol += 1;
            }
            // To the diagonal left upward
            else if ((tempRow > 0) && (tempCol > 0) &&
                (board.getPos(tempRow, tempCol) == null) && LUcount) {
                tempRow -= 1;
                tempCol -= 1;
            }
            // To the diagonal left downward
            else if ((tempRow < board.length()) && (tempCol > 0) &&
                (board.getPos(tempRow, tempCol) == null) && LDcount) {
                tempRow += 1;
                tempCol -= 1;
            }
            // To the diagonal right upward
            else if ((tempRow > 0) && (tempCol < board.length()) &&
                (board.getPos(tempRow, tempCol) == null) && RUcount) {
                tempRow -= 1;
                tempCol += 1;
            }
            // The row and col arguments are not diagonal coordinates
            else {
                break;
            }
            moveCountRow -= 1;
            moveCountCol -= 1;
        }
        if ((tempRow == row) && (tempCol == col)) {
            return true;
        }
        return false;
    }

}
