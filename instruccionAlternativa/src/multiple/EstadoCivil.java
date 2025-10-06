package multiple;

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

		switch (letra) {
		case 's':
		case 'S':
			System.out.println("Soltero/a");
			break;
		case 'c','C':
			System.out.println("Casado/a");
			break;
		case 'v','V':
			System.out.println("Viudo/a");
			break;
		case 'd','D':
			System.out.println("Divorciado/a");
			break;
		default:
			System.out.println("Error: letra incorrecta");
			break;
		}
		
	}

}
