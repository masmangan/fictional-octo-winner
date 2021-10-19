package uri1012;

public class Triangle extends Shape {

	double base;
	double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		
	}
	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2.0;
	}
	
	@Override
	public String toString() {
		return String.format("TRIANGULO: %.3f", getArea());
	}
	
}
