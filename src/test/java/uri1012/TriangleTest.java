package uri1012;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle tri = new Triangle(3.0, 5.2);
		double expected = 7.8;
		double actual = tri.getArea();
		assertEquals(expected, actual, 0.001);
	}
	@Test
	public void testTriangleFor12Dot7And15Dot2() {
		Triangle tri = new Triangle(12.7, 15.2);
		double expected = 96.52;
		double actual = tri.getArea();
		assertEquals(expected, actual, 0.001);
	}

}
