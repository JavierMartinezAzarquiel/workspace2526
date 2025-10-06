package multiple;

import java.util.Scanner;

public class Gentilicios {

	public static void main(String[] args) {
		// Pedimos el nombre de tu pueblo y pongo tu gentilicio
		
		Scanner teclado = new Scanner(System.in);
		
		String pueblo;
		
		System.out.print("¿En que pueblo vives?: ");
		pueblo = teclado.nextLine();
		
		switch (pueblo) {
		case "Toledo":
			System.out.println("Toledano/a");
			break;
		case "Illescas":
			System.out.println("Illarcuriense");
			break;
		case "Fuensalida":
			System.out.println("Fuensalidano/a");
			break;
		default:
			System.out.println("No conozco ese pueblo");
			break;
		}

	}

}
