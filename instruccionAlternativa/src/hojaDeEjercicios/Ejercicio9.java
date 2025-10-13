package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999, decir si es capicúa.
		Scanner teclado=new Scanner(System.in);
		int numero, unidades, decenas, centenas, unidadesDeMillar;
		
		//Pedimos el número
		System.out.print("Teclea un nº entre 0 y 9.999: ");
		numero = teclado.nextInt();
		
		if(numero < 10) {
			System.out.println("Si es capicua");
		}else if(numero < 100) {
			unidades = numero % 10;
			decenas = numero / 10;
			if (unidades == decenas) {
				System.out.println("Si es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}else if(numero < 1000) {
			unidades = numero % 10;
			decenas = (numero%100) / 10;
			centenas = numero / 100;
			if (unidades == centenas) {
				System.out.println("Si es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}else if(numero < 10000) {
			unidades = numero % 10;
			decenas = (numero%100) / 10;
			centenas = (numero%1000) / 100;
			unidadesDeMillar = numero / 1000;
			if (unidades == unidadesDeMillar && decenas == centenas) {
				System.out.println("Si es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}
	}

}
