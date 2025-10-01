package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Realiza un programa que nos pregunte la edad y nos diga si somos
		mayores de edad o no. El programa debe escribir en pantalla el
		resultado true o false.
	 */
	public static void main(String[] args) {
		//Declaramos un objeto que se va a encargar del teclado, podremos pedir datos al usuario
		Scanner teclado = new Scanner(System.in);
		int edad;
		
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextInt();
		
		
		boolean resultado = edad >= 18;
		
		System.out.println("Eres mayor de edad: " + resultado);
		
	}

}
