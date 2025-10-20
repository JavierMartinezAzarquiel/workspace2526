package bucleFor;

import java.util.Scanner;

public class Pedir5Numeros {

	public static void main(String[] args) {
		/*
		 * Programa que pida 5 números por teclado.
		 * Imprima la suma de los 5 números
		 */

		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0;  //esta variable se suele llamar acumulador
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma = suma + numero;  // suma += numero;
		}
		
		System.out.println("Suma total: " + suma);
	}

}

