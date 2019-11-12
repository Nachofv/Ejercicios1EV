package Unidad2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Conversor {

	public static void main(String[] args)throws IOException {

		/*
		 * En el método main de una clase Java llamada Conversor escribe un programa en
		 * Java que convierta de euros a dólares. El dato de entrada será un número
		 * decimal correspondiente a la cantidad en euros, y el dato de salida será un
		 * número decimal que representará la cantidad correspondiente en dólares con
		 * una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase
		 * Scanner.
		 */
		
		System.out.println("Conversor Euros/Dolares");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Euros: ");
		
		float euros = Float.parseFloat(in.readLine());
		
		System.out.print("Tipo de cambio Euros/Dolares: ");
		
		float tipo = Float.parseFloat(in.readLine());
		
		System.out.printf("Dolares: %.2f\n", euros * tipo);
		
		
		

	}

}
//Con JOptionPane

/*import javax.swing.*;  



public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String euro = JOptionPane.showInputDialog("Introduce cantidad en euros");
		
		int dollar = Integer.parseInt(euro);
		
	
		
		System.out.print(euro + " euros son: ");
		System.out.printf("%1.2f",dollar*1.12);
		System.out.print(" dólares.");
       
     
     

  
	}

}
*/


