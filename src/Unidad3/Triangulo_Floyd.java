package Unidad3;

import java.util.*;

public class Triangulo_Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int filas;
		int num = 1;
		int j;

		System.out.print("Introduce el número de líneas del triángulo de Floyd: ");

		filas = in.nextInt();

		for (int i = 1; i <= filas; i++) {

			for (j = 1; j <= i; j++) {

				System.out.print(" " + num);

				num++;
			}
			System.out.println();
		}
	}

}