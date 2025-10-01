package simpleYDoble;

import java.util.Scanner;

public class MayorDe2 {

	public static void main(String[] args) {
		// Pedir dos números por teclado y mostrar en pantalla el mayor de los dos

		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Teclea un número: ");
		numero1 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		numero2 = teclado.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			if (numero1 > numero2) {
				System.out.println("El mayor es: " + numero1);
			} else {
				System.out.println("El mayor es: " + numero2);
			}
		}
		
		
		
	}

}
