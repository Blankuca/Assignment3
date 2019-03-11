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
	
	@Before
	public void setup() {
		pos = new Position(1, 0);
		player = new Player();
		player.setID(1);
		piece = new Piece(1, 0, player);
		piece.setCoord(pos);
	    piece.setPlayer(player);
	}
	
	@Test
	public void testGetPosition() {
		setup();
		assertEquals(pos, piece.getPosition());
	}

	@Test
	public void testGetPlayer() {
		setup();
		assertEquals(player, piece.getPlayer());
	}

}
