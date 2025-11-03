package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que lea números hasta que se teclee un número negativo y después
			indique si se ha dado el mismo número dos veces consecutivas:
			
			Introduciendo: 1 3 5 3 4 6 7 –1
			Da como salida: No
			Introduciendo: 1 3 5 6 6 4 3 –1
			Da como salida : Si
		 */
		Scanner teclado = new Scanner(System.in);
		int numero, anterior;
		boolean repetidos = false; //variable para anotar si han salido numeros repetidos 
		
		System.out.print("Teclea un numero: "); //leo el primer número
		numero = teclado.nextInt();
		anterior = numero; 
		
		while (numero >= 0) //repetimos mientra no sea un número negativo
		{
			System.out.print("Teclea un numero: ");
			numero = teclado.nextInt();
			//comprobar si el número es igual al que pusieron antes
			if (numero == anterior) {
				repetidos = true;
			}
			//me preparo para la siguiente vuelta
			anterior = numero; //el número actual, la siguiente vuelta será el anterior
		} 
		
		if(repetidos == true) {
			System.out.println("Han salido números repetidos");
		}else {
			System.out.println("NO han salido números repetidos");
		}
	}

}






