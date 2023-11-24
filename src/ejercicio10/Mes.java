package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mes {

	public static int calcularMes(int mes) {

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario el mes
		try {
			System.out.println("Inserta el mes");
			mes = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}
		
		// Cierra el Scanner
		sc.close();
		
		// Devuelve mes al Main
		return mes;

	}

}
