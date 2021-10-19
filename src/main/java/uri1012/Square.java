package uri1012;

public class Square extends Shape {

	private double lado;

	public Square(double lado) {
		super();
		this.lado = lado;
	}

	public Square() {
		
	}
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

	@Override
	public String toString() {
		return String.format("QUADRADO: %.3f", getArea());
	}


}
