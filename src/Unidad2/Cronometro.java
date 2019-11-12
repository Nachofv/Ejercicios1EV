package Unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		
public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		
BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		
		String nombre;
		long t0;
		long t1;
		System.out.println("dime tu nombre");
		t0 = System.currentTimeMillis();
				
		nombre = in.readLine();
		
		t1 = System.currentTimeMillis();
		
		float crono = (t1 - t0) / 1000f;
		
		System.out.println("HOla " + nombre);
		System.out.printf("has tardado %1.3f segundos en decirme tu nombre",crono);
		
		
		

	}

}
