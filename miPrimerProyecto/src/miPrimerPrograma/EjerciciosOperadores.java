package miPrimerPrograma;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		final float PI = 3.141592F;
		final float E = 2.718281F;
		x=1;
		y=4;
		z=10;

		
		System.out.println(2 * x + 0.5 * y - 1 / 5D * z);
		System.out.println(PI * x * x > y || 2 * PI * x <= z);
		System.out.println(x - y + z + PI - E + 2.576689);
		
		//Evaluar la expresión 5x2 + 3x – 6 >= 0
		
		//double resultado = 5 * Math.pow(x, 2) + 3 * x - 6; 
		int resultado = 5 * (int)Math.pow(x, 2) + 3 * x - 6; 
		System.out.println("Resultado del ejercicio 1: " + (resultado >= 0));
		
		//Evaluar expresión nº2
		
		System.out.println("Resultado del ejercicio 2: " + ( (x - y) / x + (z - y) / y > y / x ) );
		
		//Ejercicio 3
		
		System.out.println("Resultado del ejercicio 3: " + (x + y <= z  &&   z < y + z) );
		
		//4. Comprobar que x es igual a y, pero no es igual a z.
		
		System.out.println("Resultado del ejercicio 4: " + (x == y && x != z) );
		
		//Ejercicio 5
		int aa=2025 , ma=9 , da=24;
		int an=2005 , mn=9 , dn=24;
		
		boolean cumple = da == dn  &&   ma == mn  &&  aa == an +20  ;
		System.out.println("Hoy es tu 20 cumpleaños: " + cumple);
		
		//Como evaluar una raiz cuadrada
		Math.sqrt(90);
	}

}








 