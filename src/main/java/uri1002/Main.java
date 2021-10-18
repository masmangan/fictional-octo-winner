package uri1002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		Circle c = new Circle();
		c.setRadius(teclado.nextDouble());
		teclado.close();
		System.out.printf("A=%.4f%n", c.getArea());
	}

}
