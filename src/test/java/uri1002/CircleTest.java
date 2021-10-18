package uri1002;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void testGetAreaFor2() {
		Circle c = new Circle();
		c.setRadius(2.0);
		double expected = 12.5664;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testGetAreaFor100Dot64() {
		Circle c = new Circle();
		c.setRadius(100.64);
		double expected = 31819.3103;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.0001);
	}	

	@Test
	public void testGetAreaFor150() {
		Circle c = new Circle();
		c.setRadius(150.0);
		double expected = 70685.7750;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.0001);
	}


	@Test
	public void test() {
		Circle c = new Circle();
		c.setRadius(5.2);
		double expected = 84.949;
		double actual = c.getArea();
		assertEquals(expected, actual, 0.001);
	}
}
