package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// numero: numero solitario introducido por el usuario
		int numero = -12345678;

		// num1: primer numero introducido por el usuario
		int num1 = -12345678;

		// num2: segundo numero introducido por el usuario
		int num2 = -12345678;

		// resultado: resultado que salga de la funcion
		int resultado;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero
		do {
			try {
				System.out.println("Inserta un numero");
				num1 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num1 == -12345678); // Fin Do While

		// Pide al usuario un numero
		do {
			try {
				System.out.println("Inserta un numero");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num2 == -12345678); // Fin Do While

		// Pide al usuario el numero solitario
		do {
			try {
				System.out.println("Inserta un numero solitario");
				numero = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (numero == -12345678); // Fin Do While

		// El resultado de Sumas.sumaEnteros se guardara en resultado
		resultado = Sumas.sumaEnteros(num1, num2);

		// Muestra el resultado por pantalla
		System.out.println("Suma de los dos primeros numeros: " + resultado);

		// El resultado de Sumas.sumaEnteros se guardara en resultado
		resultado = Sumas.sumaEnteros(numero);

		// Muestra el resultado por pantalla
		System.out.println("Suma del numero solitario: " + resultado);

		// Cierra el Scanner
		sc.close();

	}

}
