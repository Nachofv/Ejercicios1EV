package Unidad3;
import java.util.Scanner;


public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*En el método main de una clase llamada Hora escribe un programa que lea una
       hora (horas, minutos y segundos) desde el teclado y muestre en la pantalla la
       hora correspondiente al segundo siguiente. Realiza la lectura de los datos de
       entrada como estimes oportuno.*/
		
				
				
		Scanner in= new Scanner(System.in);
				
				System.out.println("Introduce hora: ");
				int hora= in.nextInt();
				System.out.println("Minutos: ");
				int minutos=in.nextInt();
				System.out.println("Segundos: ");
				int segundos=in.nextInt();
				
				segundos++;
				
				if (segundos>59) {
					segundos =0;
					minutos++;
					if (minutos>59) {
						hora=0;
						if (hora>23) {
							hora=0;
						}
					}
				}
				System.out.println(hora + " : "+minutos+ " : "+segundos);

			}

		}

	


