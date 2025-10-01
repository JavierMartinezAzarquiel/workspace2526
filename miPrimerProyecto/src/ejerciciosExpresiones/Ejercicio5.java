package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que nos pida cuantos segundos duró un concierto,
			y nos calcule cuantas horas, minutos y segundos son.
			
						Ejemplo: Cuantos segundos duró el concierto: 8479
						Equivale a 2:21:19
		 */
		Scanner teclado = new Scanner(System.in);
		int totalSegundos;
		System.out.println("¿Cuantos segundos duró el concierto?:");
		totalSegundos = teclado.nextInt();
		int horas = totalSegundos /3600;
		int minutos = (totalSegundos % 3600) /60;
		int segundos = totalSegundos % 60;
		System.out.println("El concierto duró: " + horas + ":" + minutos + ":" + segundos);
		
	}

}
