package simpleYDoble;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedimos un día del 1 al 7 y ponemos en letras el día que corresponde.
		// Si pongo un número raro me avisará
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Teclea un número del 1 al 7: ");
		numero = teclado.nextInt();
		
		//solución muy poco eficiente porque las estructuras no están relaccionadas
		if(numero == 1) { System.out.println("Lunes");}
		if(numero == 2) { System.out.println("Martes");}
		if(numero == 3) { System.out.println("Miercoles");}
		if(numero == 4) { System.out.println("Jueves");}
		if(numero == 5) { System.out.println("Viernes");}
		if(numero == 6) { System.out.println("Sabado");}
		if(numero == 7) { System.out.println("Domingo");}
		if(numero < 1 || numero > 7) { System.out.println("Número no válido");}
		
		//solución mas eficiente y formal
		if(numero == 1) { 
			System.out.println("Lunes");
		} else {
			if(numero == 2) { 
				System.out.println("Martes");
			} else {
				if(numero == 3) { 
					System.out.println("Miercoles");
				} else {
					if(numero == 4) { 
						System.out.println("Jueves");
					} else {
						if(numero == 5) { 
							System.out.println("Viernes");
						} else {
							if(numero == 6) { 
								System.out.println("Sabado");
							} else {
								if(numero == 7) { 
									System.out.println("Domingo");
								} else {
									System.out.println("Número no válido");
								}
							}
						}
					}
				}
			}
			
			//solución eficiente y más rápida de escribir
			
			if(numero == 1) { System.out.println("Lunes");}
			else if(numero == 2) { System.out.println("Martes");}
			else if(numero == 3) { System.out.println("Miercoles");}
			else if(numero == 4) { System.out.println("Jueves");}
			else if(numero == 5) { System.out.println("Viernes");}
			else if(numero == 6) { System.out.println("Sabado");}
			else if(numero == 7) { System.out.println("Domingo");}
			else { System.out.println("Número no válido");}
			
		}
		
	}

}
