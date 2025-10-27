package bucleWhile;

import java.util.Scanner;

public class SumarSerieDeNumeros {

	public static void main(String[] args) {
		/*
		 * Programa que sume la serie 1 + 1/2 + 1/3 + 1/4 + ...
		 * 
		 * Pedimos por teclado cuanto es el acumulado que queremos coseguir
		 * y nos dice cuantos terminos ha tenido que sumar
		 */

		Scanner teclado = new Scanner(System.in);
		double loQueTengoQueSumarEnTotal, suma=0;
		double contador=1; //le pongo 1 para que la primera vuelta sume 1/1
		
		System.out.print("¿Cuanto tengo que sumar en total?: ");
		loQueTengoQueSumarEnTotal = teclado.nextDouble();
		
		while (suma < loQueTengoQueSumarEnTotal) {
			//añado un termino más a la suma
			suma += 1/contador; 
			//me preparo para la siguiente vuelta, incremento el contador
			contador++;
		}
		
		System.out.println("He necesitado sumar "+ (contador-1) + " terminos");
	}

}
