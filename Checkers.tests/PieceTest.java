package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.Piece;
import checkers.Player;
import checkers.Position;


public class PieceTest {
	private Piece piece;
	private Player player;
	private Position pos;
	private Player player2;
	private Position pos2;
	
	@Before
	public void setup() {
		pos = new Position(1, 0);
		player = new Player();
		player.setID(1);
		piece = new Piece(1, 0, player);
		piece.setCoord(pos);
	}
	
	public void change() {
		player2 = new Player();
		player2.setID(2);
		piece.setPlayer(player2);
		pos2 = new Position(1,3);
		piece.setCoord(pos2);
	}
	
	//Both getPosition() and setPosition() are tested here.
	@Test
	public void testGetPosition() {
		setup();
		assertEquals(pos, piece.getPosition());
		change();
		assertEquals(pos2, piece.getPosition());
	}
	
	//Both setPlayer() and getPlayer()are tested here
	@Test
	public void testGetPlayer() {
		setup();
		assertEquals(player, piece.getPlayer());
		change();
		assertEquals(player2, piece.getPlayer());
	}

}
