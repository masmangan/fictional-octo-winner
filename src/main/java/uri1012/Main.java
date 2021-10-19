package uri1012;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import uri1002.Circle;

public class Main {

	public static void main(String[] args) {

		Scanner teclado;
		teclado = new Scanner(System.in);
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		teclado.close();

		// Shape[] shapes = {new Triangle(a, c), new Circle(c), new Square(b)};
		List<Shape> shapes = Arrays.asList(new Triangle(a, c), new Circle(c), new Square(b));
		// for (Shape shape : shapes) {
		// System.out.println(shape);
		// }
		shapes.parallelStream().forEach( System.out::println );
	}
}

//shapes.stream().forEach(new Consumer<Shape>() {
//
//	@Override
//	public void accept(Shape t) {
//		System.out.println(t);
//	}
//	
//});

//Shape tri = new Triangle(a, c);
//Shape circ = new Circle(c);
//Shape sqr = new Square(b);
//c) a área do trapézio que tem A e B por bases e C por altura. 
//e) a área do retângulo que tem lados A e B. 

//System.out.println(tri);
//System.out.println(circ);
//System.out.println(sqr);
