package com.chess.game;

public class ChessGame {

	private ChessBoard board;
	private boolean whiteTurn = true;

	public ChessGame() {
		this.board = new ChessBoard();
	}

	public boolean makeMove(Position start, Position end) {
		Piece movingPpiece = board.getPiece(start.getRow(), start.getColumn());

		if (movingPpiece == null || movingPpiece.getColor() != (whiteTurn ? PieceColor.WHITE : PieceColor.BLACK)) {

		}
	}

	public boolean isInCheck(PieceColor kingColor) {
		Position kingPosition = findKingPosition(kingColor);
		for(int row = 0; row < board.getBoard().length; row++) {
			for(int col = 0; col < board.getBoard()[row].length; col++) {
				Piece piece = board.getPiece(row, col);
				if() {
					
				}
			}
		}
	}

}
