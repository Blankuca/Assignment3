package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.Board;
import checkers.Piece;
import checkers.Player;
import checkers.Position;

public class BoardTest {
	
	private Board board;
	private Position pos;
	private Player player;
	private Piece piece;
	
	@Before
	public void setup() {
	 board = new Board();
	 pos = new Position(1, 0);
	 player = new Player();
	 player.setID(1);
	 piece = new Piece(1, 0, player);
	 piece.setCoord(pos);
	 piece.setPlayer(player);
	}
	
	public void change() {
		pos = new Position(2,3);
		piece.setCoord(pos);
		piece.setPlayer(player);
		board.setPiece(piece);
	}

	@Test
	public void testGetPiece() {
		setup();
		//assertEquals(piece, board.getPiece(pos));	
		change();
		assertEquals(piece, board.getPiece(pos));	
	}

}
