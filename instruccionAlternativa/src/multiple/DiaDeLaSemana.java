package multiple;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedimos un día del 1 al 7 y ponemos en letras el día que corresponde.
		// Si pongo un número raro me avisará
		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.print("Teclea un número del 1 al 7: ");
		numero = teclado.nextInt();

		/*la alternativa múltiple switch
		 * en lugar de condición lleva una variable
		 * cada uno de los caminos se rotula con un case:
		 * cada camino se cierra con un break
		 * el camino default: se utiliza para situaciones de error
		 */
		switch (numero) { //dependiendo del valor de número, escojo un camino
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Estas atontao");
			break;
		}
		
	}

}
