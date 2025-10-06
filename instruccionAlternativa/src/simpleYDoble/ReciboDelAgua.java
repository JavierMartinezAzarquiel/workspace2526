package simpleYDoble;

import java.util.Scanner;

public class ReciboDelAgua {

	public static void main(String[] args) {
		/*
		 * Calculamos cuanto tengo que pagar en el recibo de Aqualia
		 * Pedimos por teclado cuantos metros cúbicos hemos consumido
		 * 
		 * menos de 10 m, cada uno vale 1€
		 * los que van de 10 a 19 valen a 4€
		 * de 20 en adelante valen a 10€
		 * 
		 */

		//constantes para los precios
		final int PRECIO_BARATO = 1;
		final int PRECIO_MEDIO = 4;
		final int PRECIO_CARO = 10;
		//variables
		int metros, total;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea cuantos m\u00b3 has consumido: ");
		metros = teclado.nextInt();
		
		
		//calculamos el precio de los tres tramos.
		
		if (metros < 10) {
			total = metros * PRECIO_BARATO;
		} else if (metros < 20 ) {
			total = 9 * PRECIO_BARATO + (metros -9)*PRECIO_MEDIO;
		} else {
			total = 9 * PRECIO_BARATO + 10 * PRECIO_MEDIO + (metros -19)*PRECIO_CARO;
		}
		
		//imprimo el resultado
		System.out.println("Total a pagar: " + total + "€");
	}

}









