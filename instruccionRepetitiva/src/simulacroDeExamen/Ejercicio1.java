package simulacroDeExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que tecleen uno con las dos cifras iguales 
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, unidades, decenas;
		
		do {
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			//dividir en unidades y decenas
			unidades = numero % 10;
			decenas = numero / 10;	
		} while ( unidades != decenas);
		
		
		do {
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
		} while ( numero%11 != 0);
		
		
		System.out.println("Este ya me gusta, hemos terminado");
	}

}
