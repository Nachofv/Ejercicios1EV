package Unidad3;

import java.util.Scanner;


/* En el método main de una clase llamada ParImpar escribe un programa que
diga si un número introducido por teclado es par o impar.*/



public class ParImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce numero");

		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Es un numero par");

		} else {
			System.out.println("Es numero impar");
		}

	}

}