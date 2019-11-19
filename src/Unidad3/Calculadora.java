package Unidad3;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int n1;
		int n2;
		String op;
		int resultado = 0;

		boolean continuar = true;

		while (continuar) {

			System.out.println("¿Qué operación deseas realizar?, Introduce símbolo de operación (+,/,-,x) ");

			op = in.nextLine();
			
			System.out.println("Introduce un numero1");
			n1 = in.nextInt();

			System.out.println("Introduce numero2");
			n2 = in.nextInt();

			switch (op) {

			case "+":
				resultado = n1 + n2;
				break;

			case "-":
				resultado = n1 - n2;
				break;
			case "x":
				resultado = n1 * n2;
				break;
			case "/":
				resultado = n1 / n2;
				break;

			default:
				System.out.println("error");
				break;


			}
			System.out.println(n1 + op + n2 + " = " + resultado);

			System.out.println("Quieres realizar otra operacion? (0=no,1=si");
			continuar = in.nextInt() == 1;
			in.nextLine();

		}

	}

}
