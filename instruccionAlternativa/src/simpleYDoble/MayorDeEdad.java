package simpleYDoble;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		// Pedimos por teclado la edad y le decimos si puede votar
		
		//variable para guardar la edad
		byte edad;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextByte();
		
		//uso una alternativa simple para decir si puede votar o no
//		if (edad >= 18) {
//			System.out.println("Enhorabuena, ya puedes votar");
//		}
		
		//uso ahora una alternativa doble
		if (edad >= 18) {
			System.out.println("Enhorabuena, ya puedes votar");
		} else {
			System.out.println("Lo siento pero no puedes disfrutar de la democracia");
		}

	}

}






