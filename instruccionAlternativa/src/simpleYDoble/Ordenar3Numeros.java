package simpleYDoble;

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		// Pedir tres números por teclado y los imprimimos en orden creciente
		Scanner teclado = new Scanner(System.in);

		int numero1, numero2, numero3;

		System.out.print("Teclea un número: ");
		numero1 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		numero2 = teclado.nextInt();
		System.out.print("Teclea otro número: ");
		numero3 = teclado.nextInt();

		//solución estructurada
//		if(numero1<numero2 && numero2<numero3) {
//			System.out.println(numero1 + " " + numero2 + " " + numero3);
//		}else if (numero1 < numero2 && numero3 < numero2) {
//			System.out.println(numero1 + " " + numero3 + " " + numero2);
//		}//...
		
		//otra forma
		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				System.out.println(numero3 + " " + numero2 + " " + numero1);
			} else {
				System.out.println(numero2 + " " + numero3 + " " + numero1);
			}
		} else if (numero2 > numero1 && numero2 > numero3){
			if (numero1 > numero3) {
				System.out.println(numero3 + " " + numero1 + " " + numero2);
			} else {
				System.out.println(numero1 + " " + numero3 + " " + numero2);
			}
		}else if (numero3 > numero1 && numero3 > numero2){
			if (numero1 > numero2) {
				System.out.println(numero2 + " " + numero1 + " " + numero3);
			} else {
				System.out.println(numero1 + " " + numero2 + " " + numero3);
			}
		}
		
		//una tercera solución intercambiando los valores de las variables
		int aux;
		if(numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		if(numero2 > numero3) {
			aux = numero2;
			numero2 = numero3;
			numero3 = aux;
		}
		if(numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		System.out.println(numero1 + " " + numero2 + " " + numero3);
	}

}
