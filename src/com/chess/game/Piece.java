package com.chess.game;

public abstract class Piece {

	protected Position position;
	protected PieceColor color;

	public Piece(Position position, PieceColor pieceColor) {
		this.position = position;
		this.pieceColor = pieceColor;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public PieceColor getColor() {
		return color;
	}

	public abstract boolean isValidMove(Position newPosition, Piece[][] board);
	
}
