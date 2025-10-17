package bucleFor;

public class Prueba {

	public static void main(String[] args) {
		/*
		 * Prueba del bucle For
		 * 
		 * 	for( inicio ; condicion ; incremento){
		 * 		instrucciones;
		 *  }
		 */
		
		//bucle que imprime 5 veces la palabra Hola
			
		for (int i = 1; i <= 5; i++) {  //la variable de control i, contiene el numero de repeticiones
			System.out.println("Hola");
		}
		
		//imprimo por que repetición voy
		for (int i = 1; i <= 5; i++) {  
			System.out.println("Vuelta: " + i);
		}
		
		//imprimo la vuelta pero del revés
		for (int i = 5; i >= 1; i--) {  
			System.out.println("Vuelta: " + i);
		}
		
		//contamos vueltas de 2 en 2
		for (int i = 2; i <= 10; i+=2) {  
			System.out.println("Vuelta: " + i);
		}
		
		for (double i = 1; i <= 5; i+=0.5) {  
			System.out.println("Vuelta: " + i);
		}
	}

}
