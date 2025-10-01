package simpleYDoble;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// Pedir un número y decir si es par o impar, el cero no se considera ni par ni impar
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		if (numero == 0) {
			System.out.println("El cero no se considera par o impar");
		} else {
			if ( numero % 2 == 0) { //si el resto de dividir entre 2 es cero, es par
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
		}
		
		if (numero == 0) {
			System.out.println("El cero no se considera par o impar");
		} else if ( numero % 2 == 0) { //si el resto de dividir entre 2 es cero, es par
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
	}

}
