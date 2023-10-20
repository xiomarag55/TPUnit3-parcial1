package org.example.ejercicios;

public class CalculaAreaTriangulo1 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5.0, 4.0);
		double valor_area_triangulo = 0D;
		double b = triangulo.b();
		double h = triangulo.h();
		valor_area_triangulo =  0.5 * b * h;
		System.out.println("Altura del triángulo: " + triangulo.h());
		System.out.println("Base del triángulo: " + triangulo.b());
		System.out.println("Área del triángulo: " + valor_area_triangulo);
	}

	record Triangulo(String c, double b, double h) {}
}
