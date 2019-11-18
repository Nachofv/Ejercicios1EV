package Unidad3;

import java.util.*;

public class Adivina_numero {

	public static void main(String[] args) {

		/*
		 * 7. En el método main de una clase llamada AdivinaNumero escribe un programa
		 * para jugar a un juego de adivinación. El juego consiste en que el ordenador
		 * genera un número aleatorio entre 1 y N, ambos incluidos, siendo N un número
		 * entero mayor o igual que 1.000 y menor o igual que 100.000, que también
		 * elegirá de forma aleatoria. Una vez elegidos, el ordenador mostrará el
		 * mensaje “He pensado un número entre 1 y N, adivina cuál es: “. El usuario
		 * tendrá que introducir números hasta que acierte el que ha pensado el
		 * ordenador. Cada vez que introduzca un número y no acierte el ordenador le
		 * dirá si es mayor o menor que el que ha pensado y le volverá a preguntar
		 */

		Random resultado = new Random();
		
		Scanner in = new Scanner(System.in);
		
		boolean jugar;

		System.out.println("Quieres jugar? (0=no,1=si)");

		jugar = in.nextInt() == 1;

		while (jugar) {

			
			int max=resultado.nextInt(50)+1 ; 

			int n = resultado.nextInt(max) + 1;
			
			int nu;
			
			do {
				
				System.out.printf("He pensado un número entre 1 y %d, adivina cuál es: ", max);
				
				 nu = in.nextInt();
				
				if (n > nu) {
					
					System.out.println("El numero es mayor");
				} else if (n < nu) {
					
					System.out.println("El numero es menor");
				}

			} while (n != nu);
			
			System.out.println("Enhorabuena!!");
			
			System.out.println("Jugamos de nuevo? (0=no,1=si");
			 jugar=in.nextInt()==1;
			
		}

	}
}
