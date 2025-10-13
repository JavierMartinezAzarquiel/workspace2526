package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día
			siguiente. suponiendo que cada mes tiene un número distinto de días (suponer
			que febrero tiene siempre 28 días).
		 */
		Scanner teclado=new Scanner(System.in);
		int dia, mes, año, diasDelMes;
		
		System.out.print("Teclea el valor del día:");
		dia=teclado.nextInt();
		System.out.print("Teclea el valor del mes:");
		mes=teclado.nextInt();
		System.out.print("Teclea el valor del año:");
		año=teclado.nextInt();
		teclado.close();
		
		//primer paso, averiguar cuantos días tiene el mes seleccionado
		switch (mes) {
		case 2:diasDelMes=28;
			break;
		case 4,6,9,11:diasDelMes=30;
			break;
		default:diasDelMes=31;
		}

		//segundo paso, me hago preguntas para saber como avanzar al dia siguiente
		if(dia == diasDelMes) { //estamos a final de mes
			dia = 1;
			mes++;
			if(mes==13) {//si me he pasado, cambio de año
				mes=1;
				año++;
			}
		}else { //no estoy a final de mes
			dia++;
		}
		
		System.out.printf("Dia siguiente: %02d/%02d/%d",dia,mes,año);
	}

}





