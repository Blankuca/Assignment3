package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import checkers.Player;

import org.junit.Test;

public class PlayerTest {
	private Player player;
	
	@Before
	public void setup() {
	 player = new Player();
	}
	
	//Both getId() and setID() are tested here.
	@Test
	public void testGetID() {
		setup();
		player.setID(1);
		assertEquals(1, player.getID());
		player.setID(0);
		assertEquals(0, player.getID());
		player.setID(2);
		assertEquals(2, player.getID());
	}

}
