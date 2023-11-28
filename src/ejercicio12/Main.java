package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// num1: primer numero introducido por el usuario
		int num1 = -12345678;

		// num2: segundo numero introducido por el usuario
		int num2 = -12345678;

		// num3: tercer numero introducido por el usuario
		int num3 = -12345678;

		// resultado: resultado que salga de la funcion
		double resultado;

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
		} while (num1 < -12345678); // Fin Do While

		// Pide al usuario otro numero
		do {
			try {
				System.out.println("Inserta otro numero");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num2 < -12345678); // Fin Do While

		// Pide al usuario un ultimo numero
		do {
			try {
				System.out.println("Inserta un ultimo numero");
				num3 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num3 < -12345678); // Fin Do While

		// El resultado de Medias.media se guardara en resultado
		resultado = Medias.media(num1, num2);

		// Devuelve el resultado total
		System.out.println(resultado);

		// El siguiente resultado de Medias.media se guardara en resultado
		resultado = Medias.media(num1, num2, num3);

		// Devuelve el resultado total
		System.out.println(resultado);

		// Cierra el Scanner
		sc.close();

	}

}
