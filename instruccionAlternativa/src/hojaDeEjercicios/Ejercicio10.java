package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		Scanner teclado=new Scanner(System.in);
		int nota;
		
		//Pedimos la nota
		System.out.print("Teclea una nota: ");
		nota = teclado.nextInt();
		
		switch (nota) {
		case 0,1,2,3,4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;	
		case 6:
			System.out.println("Bien");
			break;	
		case 7,8:
			System.out.println("Notable");
			break;	
		case 9,10:
			System.out.println("Sobresaliente");
			break;	
		default:System.out.println("Nota incorrecta");
			break;
		}
	}

}
