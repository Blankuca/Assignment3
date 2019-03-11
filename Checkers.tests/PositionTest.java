package checkers_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import checkers.MyException;
import checkers.Position;

public class PositionTest {
	private Position position;
	
	@Before
	public void setup() {
	 position = new Position();
	}
	
	public void change() {
		position.setPosition(1,2);
	}
	
	@Test
	public void testAreValid() throws MyException {
		assertTrue(position.areValid(1,2));
	}

	@Test
	public void testGetCol() {
		setup();
		assertEquals(0, position.getCol());
		change();
		assertEquals(1, position.getCol());
	}

	@Test
	public void testGetRow() {
		setup();
		assertEquals(0, position.getRow());
		change();
		assertEquals(2, position.getRow());
	}

}
