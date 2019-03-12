package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.Board;
import checkers.Move;
import checkers.Piece;
import checkers.Player;
import checkers.Position;

public class BoardTest {
	
	private Board board;
	private Position pos;
	private Player player;
	private Piece piece;
	private Piece curP;
	private Piece newP;	
	private Move move;
	
	@Before
	public void setup() {
	 board = new Board();
	 player = new Player();
	 player.setID(1);
	 piece = new Piece(0,1, player);
	 pos = new Position(0,1);
	 piece.setCoord(pos);
	 board.setPiece(piece);
	}
	
	public void change() {
		pos = new Position(1,5);
		piece.setCoord(pos);
		player.setID(2);
		piece.setPlayer(player);
		board.setPiece(piece);
	}
	
	public void move() {
		pos = new Position(2,3);
		curP = new Piece(1,2, player);
		newP = new Piece(2,3, player);
		newP.setCoord(pos);
		move = new Move(curP, newP, player);
	}
	
	//Tests getPiece() and setPiece()
	@Test
	public void testGetPiece() {
		setup();
		assertEquals(piece, board.getPiece(pos));	
		change();
		assertEquals(piece, board.getPiece(pos));	
	}
	
}
