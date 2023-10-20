package org.example.ejercicios;

public class CalculaPerimetroRectangulo1 {
	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo(4.0, 6.0, 4.0, 6.0);
		double perimetro = 0;
		double l1 = rectangulo.lado1();
		double l2 = rectangulo.lado2();
		double l3 = rectangulo.lado3();
		double l4 = rectangulo.lado4();
		perimetro = l1 + l2 + l3 + l4;
		System.out.println("El perímetro del rectángulo es: " + perimetro);
	}

	record Rectangulo(double lado1, double lado2, double lado3, double lado4) {}
}
