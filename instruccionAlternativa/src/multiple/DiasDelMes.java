package multiple;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		/*
		 * Pedimos un número del 1 al 12 
		 * e imprimimos la cantidad de dias que tiene el mes.
		 * 
		 * Ejemplo:
		 *    	Teclea un numero del 1 al 12: 6
		 *      Tiene 30 dias
		 */
		
		Scanner teclado = new Scanner(System.in);

		int mes;

		System.out.print("Teclea un número del 1 al 12: ");
		mes = teclado.nextInt();

		switch (mes) { //dependemos del número de mes que han seleccionado
		case 1,3,5,7,8,10,12:
			System.out.println("El mes "+ mes + " tiene 31 días");
			break;
		case 2:
			System.out.println("El mes "+ mes + " tiene 28 días");
			break;	
		case 4,6,9,11:
			System.out.println("El mes "+ mes + " tiene 30 días");
			break;
		default:
			System.out.println("Error: més no válido");
			break;
		}
		
	}

}





