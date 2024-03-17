package com.chess.game;

public class ChessBoard {

	private Piece[][] board;
	
	public ChessBoard() {
		this.board = new Piece[8][8];
		setupPiece();
	}
	
	private void setupPiece() {
		// Place Rooks
		board[0][0] = new Rock(PieceColor.BLACK, new Position(0, 0));
		board[0][7] = new Rock(PieceColor.BLACK, new Position(0, 7));
		board[7][0] = new Rock(PieceColor.BLACK, new Position(7, 0));
		board[7][7] = new Rock(PieceColor.BLACK, new Position(7, 7));
		
		
		
	}
}
