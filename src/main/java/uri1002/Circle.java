package uri1002;

import uri1012.Shape;

public class Circle extends Shape {

	private static final double PI = 3.14159;
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
	}
	public void setRadius(double radius) {
		assert radius > 0.0;
		this.radius = radius;
	}

	
	@Override
	public String toString() {
		return String.
				format("CIRCULO: %.3f", getArea());
	}
	
	@Override
	public double getArea() {
		return PI * Math.pow(radius, 2.0);
	}

}
