package Unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*En el método main de una clase llamada Triángulo escribe un programa que
determine si tres números reales que se introducen por teclado pueden ser las
longitudes de los lados de un triángulo. Si la respuesta es afirmativa, tendrá que
responder a las preguntas siguientes:
• ¿Es escaleno?
• ¿Es equilátero?
• ¿Es isósceles*/
		
		Scanner in =new Scanner(System.in);
		
		
		System.out.println("Introduce lado 1");
		int tra = in.nextInt();
		
		System.out.println("Inroduce lado 2");
		int trb = in.nextInt();
		
		System.out.println("Introduce lado 3");
		int trc = in.nextInt();
		
		if ((tra==trb) && (tra==trc)){
				System.out.println("Es un triangulo equilatero");
			
		}if ((tra!=trb) && (trb!=trc) && (tra != trc)) {
			
			System.out.println("Es un triángulo escaleno");
		}
		
		else if ((tra==trb)&& (trb!=trc) || (trb==tra) && (trc!=trb) || (trc ==tra) && (trc!=trb) ||(tra !=trb))
		    	
		    		{
		    	System.out.println("Es un triángulo isósceles");
		    }

	}

}
