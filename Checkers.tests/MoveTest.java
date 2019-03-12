package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.Move;
import checkers.Piece;
import checkers.Player;
import checkers.MyException;

public class MoveTest {
	private Player player;
	private Player player2;
	private Piece curP;
	private Piece newP;	
	private Piece curP2;
	private Piece newP2;	
	private Move move;
	private Move move2;
	
	@Before
	public void setup() {
		player = new Player();
		player.setID(2);
		curP = new Piece(1,2, player);
		newP = new Piece(2,3, player);
		move = new Move(curP, newP, player);	
	}
	
	public void change() {
		player2 = new Player();
		player2.setID(2);
		curP2 = new Piece(1,5, player2);
		newP2 = new Piece(2,5, player2);
		move2 = new Move(curP2, newP2, player2);
	}
	
	@Test
	public void testGetPieceToMove() {
		setup();
		assertEquals(curP, move.getPieceToMove());
		change();
		assertEquals(curP2, move2.getPieceToMove());
	}

	@Test
	public void testGetPlaceToMove() {
		setup();
		assertEquals(newP, move.getPlaceToMove());
		change();
		assertEquals(newP2, move2.getPlaceToMove());
	}

	@Test
	public void testGetPlayer() {
		setup();
		assertEquals(player, move.getPlayer());
		change();
		assertEquals(player2, move2.getPlayer());
	}
	
	@Test (expected = MyException.class)
	public void testIsValidMove() throws MyException {
		setup();
		move.isValidMove();
		change();
		move2.isValidMove();
	}

}
