package bucleFor;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		/* Motrar los numeros pares hasta el que me digan
		 * 
		 *  Hasta que numero imprimo?: 10
		 *   2 4 6 8 10
		 */

		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("Hasta que numero imprimo?: ");
		numero = teclado.nextInt();
		
		for (int i = 2; i <= numero ; i+=2) {
			System.out.println(i);
		}
		
	}

}
