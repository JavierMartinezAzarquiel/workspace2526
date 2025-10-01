package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Prepara un programa que pide por teclado un número entero entre 0 y 99999, y lo escribe del revés.
			Teclea un número: 65741
			Del revés es: 14756
		 */

		Scanner teclado = new Scanner(System.in);
		
		int num, unidades, decenas, centenas, unidadesDeMillar, decenasDeMillar;
		
		System.out.println("Teclea un número: ");
		num = teclado.nextInt();
		
		unidades = num % 10;
		decenas = (num / 10) % 10;
		centenas = (num / 100) % 10;
		unidadesDeMillar = (num / 1000) % 10;
		decenasDeMillar = num / 10000;
		
		System.out.println("El número del reves es: " + unidades + decenas 
				           + centenas + unidadesDeMillar + decenasDeMillar);
	}

}
