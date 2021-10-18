package uri1012;

public class Triangle {

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

	public double getArea() {
		return (base * height) / 2.0;
	}
	
}
