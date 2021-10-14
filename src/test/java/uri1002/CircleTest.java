package uri1002;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetArea() {
		Circle c = new Circle();
		c.setRadius(2.0);
		double expected = 12.5664;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.0001);
	}

}
