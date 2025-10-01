package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Prepara un programa que pide por teclado tres números y nos dice si están ordenados o no.
		 */

		Scanner teclado = new Scanner(System.in);
		
		int a,b,c;
		
		
		System.out.println("Tecla numero 1: ");
		a = teclado.nextInt();
		
		System.out.println("Tecla numero 2");
		b = teclado.nextInt();
		
		System.out.println("Tecla numero 3");
		c = teclado.nextInt();
		
		boolean resultado;
		
		resultado = a <= b && b <= c || a >= b && b >= c;
		
		System.out.println("Ordenados: "+ resultado);
	}

}
