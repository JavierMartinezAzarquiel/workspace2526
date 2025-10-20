package bucleWhile;

import java.util.Scanner;

public class Pedir5NumerosYSumar {

	public static void main(String[] args) {
		/*
		 * Pedimos 5 números y los sumamos con un WHILE
		 */

		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;  //esta variable se suele llamar acumulador
		int contador = 0; //variable que cuenta cuantos números he leido
		
		while ( contador != 5 ) { //mientras el contador no sea 5
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			contador++; //cuento un número más que he leido
			suma = suma + numero;  // suma += numero;
		}
		
		System.out.println("Suma total: " + suma);
	}

}
