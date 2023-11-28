package ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// num1: primer numero introducido por el usuario
		int num1 = -12345678;

		// num2: segundo numero introducido por el usuario
		int num2 = -12345678;

		// num3: primer numero double introducido por el usuario
		double num3 = -12345678;

		// num4: segundo numero double introducido por el usuario
		double num4 = -12345678;

		// resultado: resultado int que sale de la funcion
		int resultadoInt;
		
		// resultadoDouble: resultado double que sale de la funcion
		double resultadoDouble;
		
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

		// Pide al usuario otro numero
		do {
			try {
				System.out.println("Inserta otro numero");
				num2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num2 == -12345678); // Fin Do While

		// Pide al usuario un numero double
		do {
			try {
				System.out.println("Inserta un numero para DOUBLE");
				num3 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num3 < -12345678); // Fin Do While

		// Pide al usuario otro numero double
		do {
			try {
				System.out.println("Inserta otro numero para DOUBLE");
				num4 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
				sc.nextLine();
			}
		} while (num4 < -12345678); // Fin Do While

		// El resultado de Suma.suma se guardara en resultadoDouble
		resultadoInt = Sumas.suma(num1, num2);

		// Muestra el resultado por pantalla
		System.out.println(num1+"+"+num2+"="+resultadoInt);

		// El resultado de Suma.suma se guardara en resultadoInt
		resultadoDouble = Sumas.suma(num3, num4);

		// Muestra el resultado por pantalla
		System.out.println(num3+"+"+num4+"="+resultadoDouble);

		// Cierra el Scanner
		sc.close();

	}

}
