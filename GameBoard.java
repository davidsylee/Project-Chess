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

    private ChessPiece[][] board;
    private ArrayList<ChessPiece> trash;


    // Constructor for an instance of the GameBoard class
    public GameBoard() {
        board = new ChessPiece[8][8];
        trash = new ArrayList<ChessPiece>();
    }

    /** TO DO

    // Constructor for an instance using a special RuleBook
    public GameBoard(File input) {}

    */


   /**
    * Retrieves the ChessPiece in this position of the board for the move
    * method in ChessPiece.
    *
    */
    public ChessPiece getPos(int row, int col) {
        return board[row][col];
    }

   /**
    * Sets a ChessPiece on this position of the board for the move method
    * in ChessPiece.
    *
    */
    public void setPos(int row, int col, ChessPiece piece) {
        if (board[row][col] != null) {
            trash.add(board[row][col]);
        }
        board[row][col] = piece;
    }
}
