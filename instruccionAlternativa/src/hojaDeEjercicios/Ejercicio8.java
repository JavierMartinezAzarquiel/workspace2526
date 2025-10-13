package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.

		Scanner teclado=new Scanner(System.in);
		int numero, unidades, decenas, centenas, unidadesDeMillar;
		
		//Pedimos el número
		System.out.print("Teclea un nº entre 0 y 9.999: ");
		numero = teclado.nextInt();
		
		if(numero < 10) {
			System.out.println("Del revés: " + numero);
		}else if(numero < 100) {
			unidades = numero % 10;
			decenas = numero / 10;
			System.out.println("Del revés: " + unidades + decenas);
		}else if(numero < 1000) {
			unidades = numero % 10;
			decenas = (numero%100) / 10;
			centenas = numero / 100;
			System.out.println("Del revés: " + unidades + decenas + centenas );
		}else if(numero < 10000) {
			unidades = numero % 10;
			decenas = (numero%100) / 10;
			centenas = (numero%1000) / 100;
			unidadesDeMillar = numero / 1000;
			System.out.println("Del revés: " + unidades + decenas + centenas + unidadesDeMillar);
		}
	}

}
