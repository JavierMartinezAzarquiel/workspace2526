package miPrimerPrograma;

public class TiposDeDatos {

	public static void main(String[] args) {
		//Vamos a probar los tipos de datos boolean
		
//		boolean hayToner;
//		
//		hayToner = true;
//		hayToner = false;
		
		//tipos caracter
		String frase; //variable donde guardar un texto largo
		char letra;  //variable donde solo cabe una letra
		
		frase = "Hola a todos";
		letra = 'a';
		letra = '\t';  //caracter tabulador
		letra = '\n';  //caracter intro
		
		frase ="Hola\t a todos";
		
		System.out.println(frase);
		
		//tipos númericos enteros
		
		byte pequeña;
		short mediana;
		int grande;
		long enorme;
		
		
		pequeña = 16;
		mediana = 20000;
		grande = 1827373838;
		enorme = 19238928474983L;
		
		
		float pocosDecimales;
		double muchosDecimales;
		
		pocosDecimales = 17834784.234234F;
		muchosDecimales = 237822399.2242686768;
		
		
		pequeña--;
		pequeña = (byte)(pequeña - 1);
		System.out.println(pequeña);
		
		boolean resultado;
		
		resultado = mediana > grande;
		
		System.out.println(resultado);
				
		//probar los operadores lógicos
		boolean hayToner = false;
		boolean hayPapel = true;
		
		resultado = hayToner && hayPapel;
		
		System.out.println("Puedo imprimir?: " + resultado);
		
		boolean familiaNumerosa = true;
		boolean rentaFamiliarBaja = false;
		
		resultado = familiaNumerosa || rentaFamiliarBaja;
		
		System.out.println("¿Me darán beca?: " + resultado);
				
		
				
	}
	
	
}











