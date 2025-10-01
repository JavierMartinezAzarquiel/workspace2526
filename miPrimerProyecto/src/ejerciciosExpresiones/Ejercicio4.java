package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
				pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
				gravedad en de 9.8, mientras que en la Luna es de 1.62
		 */

		//declaro dos constantes para las diferentes gravedades
		final double GTIERRA = 9.8;
		final double GLUNA = 1.62;
		
		Scanner teclado = new Scanner(System.in);
//		double peso;
		
		System.out.print("Introduce tu peso: ");
		double peso = teclado.nextDouble();
		teclado.close();
		
		double respuesta = peso * GLUNA / GTIERRA;
		System.out.println("Tu peso en la luna sería de " + respuesta + "KG");
	}

}
