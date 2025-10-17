package bucleWhile;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		/*	Probamos el bucle While
		 * 
		 *   while(condicion){
		 *   	Instrucciones;
		 *   }
		 * 
		 * 
		 * 	 do{
		 * 		Instrucciones;
		 *   }while(condicion);
		 */
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		//pedir números por teclado hasta que pongan el 0
//		do {
//			System.out.print("Teclea un numero: ");
//			numero = teclado.nextInt();
//		} while (numero != 0);
//		
//		System.out.println("Ya hemos terminado");
		
		System.out.print("Teclea un numero: "); //pido un número antes de comenzar el bucle
		numero = teclado.nextInt();				//se le llaman lectura anticipada
		//usando un bucle while
		while (numero != 0){
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
		}
		
		System.out.println("Ya hemos terminado");
	}

}






