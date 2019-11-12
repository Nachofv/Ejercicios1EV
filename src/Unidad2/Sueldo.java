package Unidad2;

import java.util.Scanner;

public class Sueldo {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * En el método main de una clase Java llamada Sueldo escribe un programa que
		 * resuelva el problema siguiente: un vendedor recibe un sueldo base más un 10%
		 * extra por comisión de sus ventas; el vendedor desea saber cuánto dinero
		 * obtendrá por concepto de comisiones, por las tres ventas que realiza en el
		 * mes y el total que recibirá en el mes, teniendo en cuenta su sueldo base y
		 * las comisiones. Se utilizará el teclado para la entrada de datos y la consola
		 * para la salida. Para resolver este problema está permitido utilizar la clase
		 * Scanner.
		 */

		teclado = new Scanner(System.in);

		System.out.println("Introduce sueldo base");

		double Sueldo_base = teclado.nextDouble();
		double comision = 0.10;
		double ventas;

		ventas = Sueldo_base * comision;

		double total_comision = ventas * 3;

		System.out.printf("La comision por ventas es %1.2f", ventas);

		System.out.println();

		System.out.printf("Y el total mensual es %1.2f ", Sueldo_base + total_comision);

	}

}
