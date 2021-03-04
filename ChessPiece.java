/**
 * Master class: MasterBoard.java
 *
 * Subclass files: Pawn.java, Bishop.java, Knight.java, Rook.java,
 * Queen.java, King.java
 *
 * This file contains instance attributes and methods for the chess pieces.
 *
*/
public class ChessPiece {

    private static String name;
    private static int moveCount;

    // retrieves and returns the private variable name
    public String getName() {
        return this.name;
    }

    // retrieves and returns the private variable moveCount
    public int getMoveCount() {
        return this.moveCount;
    }

    // Checks to see if the ChessPiece can move to a given position
    public boolean canMove(int newRow, int newCol) {
        // TODO--------------------------------------
        return false;
    }

    // Moves the ChessPiece on the GameBoard
    public void move(int newRow, int newCol, GameBoard board) {
        if (this.canMove(newRow, newCol)) {
            board.setPos(newRow, newCol, this);
        }
        else {
            System.out.println("CANNOT MOVE PIECE TO GIVEN POSITION");
        }
    }
}
