package simpleYDoble;

import java.util.Scanner;

public class Ordenar2Numeros {

	public static void main(String[] args) {
		// Pedir dos números por teclado y los imprimimos en orden creciente
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Teclea un número: ");
		numero1 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		numero2 = teclado.nextInt();
		
		if ( numero1 > numero2) {
			System.out.println(numero2 + " " + numero1);
		} else {
			System.out.println(numero1 + " " + numero2);
		}
	}

}
