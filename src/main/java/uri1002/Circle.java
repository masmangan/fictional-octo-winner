package uri1002;

public class Circle {

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

	public double getArea() {
		return PI * Math.pow(radius, 2.0);
	}

}
