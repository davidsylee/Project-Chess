/**
 * Master class: MasterBoard.java
 *
 * Subclass files: Pawn.java, Bishop.java, Knight.java, Rook.java,
 * Queen.java, King.java
 *
 * This file contains instance attributes and methods for the chess pieces.
 *
*/
public abstract class ChessPiece {

    public int rowPos;
    public int colPos;

    private static String name;

    // retrieves and returns the private variable name
    public static String getName() {
        return name;
    }

    public int getRow() {
        return rowPos;
    }

    public int getCol() {
        return colPos;
    }

    // Checks to see if the ChessPiece can move to a given position
    public abstract boolean canMove(GameBoard board, int row, int col);

/**
    // Moves the ChessPiece on the GameBoard
    public void move(int newRow, int newCol, ChessPiece[][] board) {
        if (piece.canMove(board)) {
            // board[][];
            // GOTTA WORK ON THIS IMPLEMENTATION
        }
        else {
            System.out.println("CANNOT MOVE PIECE TO GIVEN POSITION");
        }
    }
*/

}
