package bucleFor;

public class TodasLasTablas {

	public static void main(String[] args) {
		// imprimimos todas las tablas desde el 1 al 10
		
		
		for (int numero = 1; numero <= 10; numero++) {
			
			System.out.println("Tabla del " + numero);
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero*i));
			}
			
		}
		
		

	}

}
