package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.

		Scanner teclado=new Scanner(System.in);
		int numero;
		
		//Pedimos el número
		System.out.print("Teclea un nº: ");
		numero = teclado.nextInt();
		
		if (numero < 10) {
			System.out.println("Tiene 1 cifra");
		} else if(numero <100){
			System.out.println("Tiene 2 cifras");
		} else if(numero <1000){
			System.out.println("Tiene 3 cifras");
		} else {
			System.out.println("Tiene 4 cifras");
		}
		
	}

}
