package bucleWhile;

import java.util.Scanner;

public class SumarNumerosHasta0 {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que ponemos un 0
		 * Imprimimos como resultado la suma de todos ellos.
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, suma=0, cuenta=0;
		
		do { //uso un do-while porque como minimo tendré que pedir un número
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			
			//sumo el número al total
			suma += numero;
			//cuento uno mas
			cuenta++;
			
		} while (numero != 0);
		
		System.out.println("La suma total es: " + suma);
		System.out.println("Total de números tecleados: " + cuenta);
	}

}
