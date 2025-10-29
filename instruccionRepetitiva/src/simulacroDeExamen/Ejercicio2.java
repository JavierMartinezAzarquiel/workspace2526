package simulacroDeExamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Pedir un número y averiguar si es perfecto.
		 * La suma de los divisores debe ser igual al número.
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0;
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) { //si i es un divisor
				suma += i; //añado i a la suma de divisores
			}
		}
		
		if ( suma == numero) {
			System.out.println("SI Es un numero Perfecto");
		} else {
			System.out.println("NO es Perfecto");
		}
		
	}

}








