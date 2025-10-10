package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que dada una medida de tiempo expresada en horas,
			minutos y segundos con valores arbitrarios, elabore un programa que
			transforme dicha medida en una expresión correcta.

			Introduciendo: 3 Horas 118 Minutos 195 Segundos
			Da como salida: 5 Horas 1 Minuto 15 Segundos
		 */

		Scanner teclado=new Scanner(System.in);  //linea de gestion de teclado
		int horas,minutos,segundos;

		System.out.print("Teclea un número de horas: ");
		horas=teclado.nextInt();
		System.out.print("Teclea un número de minutos: ");
		minutos=teclado.nextInt();
		System.out.print("Teclea un número de segundos: ");
		segundos=teclado.nextInt();

		//comprobar si los segundos NO están correctos
		if(segundos > 59) {
			minutos += segundos / 60; //añado los minutos que puedo sacar de los segundos
			segundos = segundos % 60; //resto de los segundos
		}
		//comprobar si los minutos NO están correctos
		if(minutos > 59) {
			horas += minutos / 60; //añado las horas que puedo sacar de los minutos
			minutos = minutos % 60; //me quedo con el resto de minutos
		}
		
		
		System.out.println("Tiempo correcto: "+ horas +"Horas "
		                    + minutos + "Minutos " + segundos + "Segundos");
		System.out.printf("Tiempo correcto: %d:%02d:%02d",horas,minutos,segundos);
	}

}







