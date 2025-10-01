package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida cual es el radio de una circunferencia y nos calcule cual es la longitud y el área.

				Longitud = 2πr
				Área = πr2

		 */
        //Declaro la constante PI
		//final double PI= 3.14159;
		Scanner teclado = new Scanner(System.in);
		
		//Variables que necesito
		double radio, longitud, area;
		System.out.println("¿Cuál es el radio de la circunferencia?");
		radio=teclado.nextDouble();
		teclado.close();
		
		// Cálculos paso a paso
		
		longitud= 2 * Math.PI * radio;
		area= Math.PI * Math.pow(radio, 2);
		System.out.println("Radio:"+radio);
		System.out.println("Longitud:"+longitud);
		System.out.println("Area:"+area);
		
		
		
	}

}
