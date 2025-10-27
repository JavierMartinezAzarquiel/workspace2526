package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Programa que lea 5 números y diga cuántos son múltiplos de 3, cuántos
			múltiplos de 5 y cuántos no están incluidos en ninguno de los grupos anteriores.
			
			Introduciendo: 1 20 5 18 15
			Da como salida: 2 múltiplos de 3
			3 múltiplos de 5
			
			1 no son múltiplos de nada
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, multiplosDe3=0, multiplosDe5=0, multiplosDeNada=0;
		
		for (int i = 1; i <= 5; i++) {
			//leer un número
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			//comprobar si es multiplo de 3
			if (numero % 3 == 0) {
				multiplosDe3++;
			}
			//comprobar si es multiplo de 5
			if (numero % 5 == 0) {
				multiplosDe5++;
			}
			//comprobar si es multiplo de nada
			if (numero % 3 != 0 && numero % 5 != 0) {
				multiplosDeNada++;
			}
		}
		
		//imprimir el resultado
		System.out.println(multiplosDe3 + " multiplos de 3");
		System.out.println(multiplosDe5 + " multiplos de 5");
		System.out.println(multiplosDeNada + " multiplos de nada");

		
	}

}
