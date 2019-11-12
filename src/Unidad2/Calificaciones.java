package Unidad2;

import java.io.*;

public class Calificaciones {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Nota de matematicas");
		System.out.println("------------------");

		float notaM = Float.parseFloat(in.readLine());

		System.out.println("Nota de la primera tarea: ");

		float notaT1M = Float.parseFloat(in.readLine());

		System.out.println("Nota de la segunda tarea ");

		float notaT2M = Float.parseFloat(in.readLine());

		System.out.println("Nota de terera tarea : ");

		float nota3TM = Float.parseFloat(in.readLine());

		float mediaM = notaM * 0.9f + (notaT1M + notaT2M + nota3TM) / 3 * 0.1f;

		System.out.printf("La nota media de Matemáticas es %1.2f ", mediaM);
		System.out.println();
		System.out.println();

		System.out.println("\n Nota de Fisica");
		System.out.println("---------------");

		float notaF = Float.parseFloat(in.readLine());

		System.out.println("Nota de la primera tarea: ");

		float notaT1F = Float.parseFloat(in.readLine());

		System.out.println("Nota de la segunda tarea ");

		float notaT2F = Float.parseFloat(in.readLine());

		float mediaF = notaF * 0.8f + (notaT1F + notaT2F) / 2 * 0.2f;

		System.out.printf("La nota media de Física es %1.2f ", mediaF);
		System.out.println();
		System.out.println();
		

		System.out.println("Nota de Química");
		System.out.println("---------------");

		float notaQ = Float.parseFloat(in.readLine());

		System.out.println("Nota de la primera tarea: ");

		float notaT1Q = Float.parseFloat(in.readLine());

		System.out.println("Nota de la segunda tarea ");

		float notaT2Q = Float.parseFloat(in.readLine());

		System.out.println("Nota de terera tarea : ");

		float nota3TQ = Float.parseFloat(in.readLine());

		float mediaQ = notaQ * 0.85f + (notaT1Q + notaT2Q + nota3TQ) / 3 * 0.15f;

		System.out.printf("La nota media de Qímica es %1.2f ", mediaQ);
		System.out.println();
		System.out.println();
		
		
		float nota_final= (mediaM + mediaF + mediaQ) / 3;
		
		System.out.printf("La nota final es >>>>>>>> %1.2f ",nota_final);
		
	}

}
