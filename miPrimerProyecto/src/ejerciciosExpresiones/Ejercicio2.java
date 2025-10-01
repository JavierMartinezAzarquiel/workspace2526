package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * 2. Diseña un programa que indique si un número pasado por teclado es
			  múltiplo de siete o no.
		 */

		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		
		int resto = num % 7; //calculo el resto de dividir el numero entre 7
		
		boolean resultado = (resto == 0); //verificamos si el resto es cero
		
		System.out.println("¿Es multiplo de 7?: " + resultado);
	}

}
