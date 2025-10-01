package ejerciciosExpresiones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Programa que permita teclear un número correspondiente a un año y
				calcule y visualice si es bisiesto o no. (Un año es bisiesto si es múltiplo
				de 4 y no es múltiplo de 100 o bien es múltiplo de 400).
		 */

		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un año: ");
		int año=teclado.nextInt();
		teclado.close();//cerramos el teclado en el momento que ya no lo vamos a necesitar mas
		boolean bisiesto=(((año%4==0)&&(año%100!=0))||(año%400==0));
		System.out.println("El año introducido es bisiesto?: "+bisiesto);
	}

}
