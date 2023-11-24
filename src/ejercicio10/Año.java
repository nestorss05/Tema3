package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Año {

	public static int calcularAños(int año) {

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario el año
		try {
			System.out.println("Inserta el año");
			año = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}
		
		// Cierra el Scanner
		sc.close();
		
		// Devuelve dia al Main
		return año;

	}

}
