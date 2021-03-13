/**
 * Master class: MasterBoard.java
 *
 * Subclass files: None
 *
 * This file contains instance attributes and methods for the game board.
 *
*/

import java.util.ArrayList;
import java.lang.*;

public class GameBoard {

    private ChessPiece[][] position;
    private ArrayList<ChessPiece> trash;


    // Constructor for an instance of the GameBoard class
    public GameBoard() {
        position = new ChessPiece[8][8];
        trash = new ArrayList<ChessPiece>();
    }

    // Constructor for an instance using a special RuleBook
    public GameBoard(String RuleBook) {
        // TO-DO
    }

    // Retrieves the length of the board (row)
    public int length() {
        return position.length;
    }

   /**
    * Retrieves the ChessPiece in this position of the board for the move
    * method in ChessPiece.
    *
    */
    public ChessPiece getPos(int row, int col) {
        return position[row][col];
    }

   /**
    * Sets a ChessPiece on this position of the board for the move method
    * in ChessPiece.
    *
    */
    public void setPos(int row, int col, ChessPiece piece) {
        int tempRowPos = piece.getRow();
        int tempColPos = piece.getCol();

        if (position[row][col] != null) {
            trash.add(position[row][col]);
        }
        
        position[tempRowPos][tempColPos] = null;
        position[row][col] = piece;
    }
}
