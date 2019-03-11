package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.Move;
import checkers.Piece;
import checkers.Player;
import checkers.Position;

public class MoveTest {
	private Position pos1;
	private Position pos2;
	private Player player;
	private Piece curP;
	private Piece newP;	
	private Move move;
	
	@Before
	public void setup() {
		//pos1 = new Position();
		//pos2 = new Position();
		//pos1.setPosition(1, 0);
		//pos2.setPosition(2, 1);
		player = new Player();
		player.setID(1);
		curP = new Piece(1,0, player);
		newP = new Piece(1,0, player);
		//curP.setPlayer(player);
		//newP.setPlayer(player);
		//curP.setCoord(pos1);
		//newP.setCoord(pos2);
		move = new Move(curP, newP, player);
	}
	
	
	@Test
	public void testGetPieceToMove() {
		setup();
		assertEquals(curP, move.getPieceToMove());
	}

	@Test
	public void testGetPlaceToMove() {
		setup();
		assertEquals(newP, move.getPlaceToMove());
	}

	@Test
	public void testGetPlayer() {
		setup();
		assertEquals(player, move.getPlayer());
	}
	/*
	@Test
	public void testIsValidMove() {
		setup();
		assert
	}
	*/

}
