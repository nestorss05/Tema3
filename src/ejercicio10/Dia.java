package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dia {

	public static int calcularDias(int dia) {

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario el dia
		try {
			System.out.println("Inserta el dia");
			dia = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}
		
		// Cierra el Scanner
		sc.close();
		
		// Devuelve dia al Main
		return dia;

	}

}
