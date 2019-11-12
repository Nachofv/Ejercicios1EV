package Unidad2;

import java.util.Scanner;

/*
 * Programa que convierte las componentes de un color en el espacio RGB en sus componentes
 * en el espacio YIQ según las expresiones matemáticas siguientes:
 * 			y=0,299r + 0,587g + 0,114b
 * 			i=0,596r − 0,275g − 0,321b
 * 			q=0,212r − 0,528g + 0,311b
 * Se le pedirá al usuario que introduzca por teclado las componentes rgb (rojo, verde y azul).
 */

public class ConversorColores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Conversor RGB/YIQ");
		System.out.print("Componente roja: ");
		int r = in.nextInt();
		System.out.print("Componente verde: ");
		int g = in.nextInt();
		System.out.print("Componente azul: ");
		int b = in.nextInt();
		float y = 0.299f * r + 0.587f * g + 0.114f * b;
		float i = 0.596f * r - 0.275f * g - 0.321f * b;
		float q = 0.212f * r - 0.528f * g + 0.311f * b;
		System.out.printf("YIQ = (%.3f, %.3f, %.3f)\n", y, i, q);
	}

}
