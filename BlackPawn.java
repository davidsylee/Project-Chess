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
    private static int moveCount = 1;

    private int rowPos;
    private int colPos;

    // The constructor for a Pawn piece
    public BlackPawn(int rowPos, int colPos) {
        this.rowPos = rowPos;
        this.colPos = colPos;
        // Poor guy... You'll probably die asap.
    }

    @Override
    public boolean canMove(ChessPiece[][] board) {
        // When there is an open space in front of the Pawn
        if (rowPos - 1 >= 0 && board[rowPos - 1][colPos] == null) {
            return true;
        }
        else if (rowPos - 1 >= 0 && colPos - 1 >= 0 &&
                 board[rowPos - 1][colPos - 1] &&
                 board[rowPos - 1][colPos - 1] != null) {
            return true;
        }
        else if (rowPos - 1 >= 0 && colPos + 1 < board.length &&
                 board[rowPos - 1][colPos + 1] &&
                 board[rowPos - 1][colPos + 1] != null) {
            return true;
        }
        return false;
    }












}
