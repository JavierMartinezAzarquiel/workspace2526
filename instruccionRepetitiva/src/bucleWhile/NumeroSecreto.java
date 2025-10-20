package bucleWhile;

import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		/*
		 * Pedir números hasta que acertemos el número secreto que hemos elegido
		 * de manera aleatoria.
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
			
			if (numero < secreto) {
				System.out.println("Mayor");
			} else if(numero > secreto) {
				System.out.println("Menor");
			}
		} while ( numero != secreto );

		System.out.println("Enhorabuena!!!");
		System.out.println("Has necesitado "+intentos+" intentos");
	}

}
