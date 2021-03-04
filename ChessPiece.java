/**
 * Master class: MasterBoard.java
 *
 * Subclass files: Pawn.java, Bishop.java, Knight.java, Rook.java,
 * Queen.java, King.java
 *
 * This file contains instance attributes and methods for the chess pieces.
 *
*/
public interface ChessPiece {

    private static String name;
    private static int moveCount;
    private int[][] position;

    // retrieves and returns the private variable name
    public static String getName() {
        return name;
    }

    // retrieves and returns the private variable moveCount
    public static int getMoveCount() {
        return moveCount;
    }



}
