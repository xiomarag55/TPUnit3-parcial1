package org.example.ejercicios;

import java.util.List;

public class Facturaciom5 {
	record Factura(String cliente, String fechafactura, List<Double> precioProducto) {
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Mania Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

		double totalValorFact1 = 0;
		for (Double precio : factura1.precioProducto) {
			totalValorFact1 += precio;
		}
		System.out.println("Factura 1" );
		System.out.println("Cliente: " + factura1.cliente());
		System.out.println("Total: " + totalValorFact1);


		double totalValorFact2 = 0;
		for (Double precio : factura2.precioProducto) {
			totalValorFact2 += precio;
		}
		System.out.println("Factura 2" );
		System.out.println("Cliente: " + factura2.cliente());
		System.out.println("Total: " + totalValorFact2);
	}

}
