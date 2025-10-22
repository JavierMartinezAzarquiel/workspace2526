package bucleFor;

import java.util.Scanner;

public class TablaElegidaUsuario {

	public static void main(String[] args) {
		// Imprimimos la tabla que elija el usuario
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("¿Que tabla quieres?: ");
		numero = teclado.nextInt();
		
		System.out.println("Tabla del " + numero);
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
		
	}

}
