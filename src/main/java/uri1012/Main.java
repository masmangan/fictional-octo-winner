package uri1012;

import java.util.Scanner;

import uri1002.Circle;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		teclado.close();
		
		Triangle tri = new Triangle(a, c);
		Circle circ = new Circle(c);
//		c) a área do trapézio que tem A e B por bases e C por altura. 
//		d) a área do quadrado que tem lado B. 
//		e) a área do retângulo que tem lados A e B. 

		System.out.printf("TRIANGULO: %.3f%n", tri.getArea());
		System.out.printf("CIRCULO: %.3f%n", circ.getArea());
	}

}
