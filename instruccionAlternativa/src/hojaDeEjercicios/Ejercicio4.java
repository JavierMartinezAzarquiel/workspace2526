package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que nos diga si un número ha conseguido o no el reintegro en el
			sorteo de la ONCE. Un número de cinco cifras consigue el reintegro si su
			primera o última cifra coincide con la primera o última cifra del número
			agraciado en el sorteo.
			
			Introduciendo: 23745 y premiado es 29348
			Da como salida: Si tiene reintegro
		 */

		Scanner teclado=new Scanner(System.in);  //linea de gestion de teclado
		int numeroJugado, numeroPremiado;

		System.out.print("Teclea el número que juegas: ");
		numeroJugado=teclado.nextInt();
//		System.out.print("Teclea el número premiado: ");
//		numeroPremiado=teclado.nextInt();
		
		//Elegimos un número premiado de manera aleatoria
		numeroPremiado = (int)(Math.random()*100000);
		System.out.printf("Numero premiado: %05d ", numeroPremiado);
		
		int primeraCifraJugado = numeroJugado / 10000;
		int primeraCifraPremiado = numeroPremiado / 10000;
		int ultimaCifraJugado = numeroJugado % 10;
		int ultimaCifraPremiado = numeroPremiado % 10;
		
		if( primeraCifraJugado == primeraCifraPremiado || ultimaCifraJugado == ultimaCifraPremiado ) {
			System.out.println("Enhorabuena, tienes reintegro");
		}else {
			System.out.println("Lo siento, no hay premio");
		}
		
	}

}
