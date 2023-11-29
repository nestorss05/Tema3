package ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// respuesta: respuesta introducida en la funcion pideNumero
		int respuesta;

		// numero: numero introducido en pideNumero
		double numero;

		// Muestra el menu
		respuesta = mostrarMenu();

		// Pide la opcion al usuario
		numero = pideNumero();

		// Cierra el Scanner
		sc.close();

	}

	static int mostrarMenu() {

		// opcion: opcion elegida por el usuario
		int opcion = -1;

		// correcto: booleana que comprobara si el resultado introducido es correcto
		boolean correcto = false;

		// Se mostrara el menu
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("5. Maximo");
		System.out.println("6. Minimo");
		System.out.println("0. Salir");

		// Pide al usuario la opcion
		do {
			try {
				opcion = sc.nextInt();
				if (opcion < 0 || opcion > 6) {
					System.out.println("ERROR: Opcion invalida");
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Opcion invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Se acabara preguntando otra vez, por lo que correcto sera false
		correcto = false;

		// Devuelve el resultado al main
		return opcion;

	}

	static double pideNumero() {

		// numero1: numero introducido por el usuario
		double numero1 = -1;

		// correcto: booleana que comprobara si el resultado introducido es correcto
		boolean correcto = false;

		// Pide al usuario la opcion
		do {
			try {
				System.out.println("Inserta un numero");
				numero1 = sc.nextDouble();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Devuelve el resultado al main
		return numero1;

	}

}
