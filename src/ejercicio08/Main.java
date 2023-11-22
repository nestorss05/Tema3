package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// numero: numero introducido por el usuario
		int numero = 0;

		// divisoresPrimos: cantidad de divisores primos de n
		int divisoresPrimos = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While: Pide al usuario un numero
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero < 1) {
					System.out.println("ERROR: El numero debe ser positivo");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El dato introducido no es ningun numero");
			}
		} while (numero < 1); // Fin Do While

		// Se continuara en DivisoresPrimos para asignarlo a la variable divisoresPrimos
		divisoresPrimos = DivisoresPrimos.divisoresprimos(numero, divisoresPrimos);

		// Muestra el resultado por pantalla
		System.out.println("Hay " + divisoresPrimos + " divisores primos");
		
		// Cierra el Scanner
		sc.close();

	}

}
