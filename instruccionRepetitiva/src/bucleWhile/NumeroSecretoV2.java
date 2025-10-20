package bucleWhile;

import java.util.Scanner;

public class NumeroSecretoV2 {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que acertemos el número secreto que hemos elegido
		 * de manera aleatoria.
		 * El número máximo de intentos es 10. Si no hemos acertado, el programa debe terminar
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		//variables
		int numero;  //en esta variable voy a guardar el número que tecleen
		int secreto = (int)(Math.random()*100); //número que tienen que adivinar
		int intentos = 0; //variable para contar el número de intentos que he necesitado
		
		//pedir números hasta que acierten
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			intentos++;//un intento mas
			
			if (intentos !=10) {//si estoy en el último intento, ya no ofrezco ayuda
				if (numero < secreto) {
					System.out.println("Mayor");
				} else if(numero > secreto) {
					System.out.println("Menor");
				}
			}
			
		} while ( numero != secreto && intentos != 10 ); //repito mientras no acierte y los intentos no sean 10

		if (numero == secreto) {
			System.out.println("Enhorabuena!!!");
			System.out.println("Has necesitado "+intentos+" intentos");
		} else {
			System.out.println("Eres un pringao");
		}
		
	}

}
