package simpleYDoble;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		/*
		 * Programa que pida una letra del estado civil y responde poniendo la palabra que corresponda
		 * 
		 * 	Ss  Soltero/a
		 * 	Cc  Casado/a
		 * 	Vv  Viudo/a
		 *  Dd  Divorciado/a
		 *  
		 */

		Scanner teclado = new Scanner(System.in);
		
		char letra;
		
		System.out.print("Teclea la letra de tu estado civil: ");
		letra = teclado.nextLine().charAt(0); //leemos una letra de teclado
		
		if (letra == 's' || letra == 'S') {
			System.out.println("Soltero/a");
		}else if (letra == 'c' || letra == 'C'){
			System.out.println("Casado/a");
		}else if (letra == 'v' || letra == 'V'){
			System.out.println("Viudo/a");
		}else if (letra == 'd' || letra == 'D'){
			System.out.println("Divorciado/a");
		}else {
			System.out.println("Letra incorrecta");
		}
		
	}

}
