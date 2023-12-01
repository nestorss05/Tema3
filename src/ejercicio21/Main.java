package ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// respuesta: respuesta introducida en la funcion pideNumero
		int respuesta;

		// numero1: primer numero a operar
		double numero1;

		// numero2: segundo numero a operar
		double numero2;

		// Do While
		do {
			// Muestra el menu
			respuesta = mostrarMenu();

			// Si la respuesta es 0, continuar sera falso, y tumbara el bucle entero
			if (respuesta == 0) {
				break;
			}

			// Pide el primer numero al usuario
			numero1 = pideNumero();

			// Pide el segundo numero al usuario
			numero2 = pideNumero();

			// Se definira op para la clase Operaciones, con numero1 y numero2 como
			// variables
			Operaciones op = new Operaciones(numero1, numero2);

			// Switch: por cada respuesta, se hara una operacion o otra, llamando a op y a
			// su respectiva funcion
			switch (respuesta) {
			case 1 -> {
				System.out.println(op.suma());
			}
			case 2 -> {
				System.out.println(op.resta());
			}
			case 3 -> {
				System.out.println(op.multiplicacion());
			}
			case 4 -> {
				System.out.println(op.division());
			}
			case 5 -> {
				System.out.println(op.maximo());
			}
			case 6 -> {
				System.out.println(op.minimo());
			}
			default -> {
				System.out.println("ERROR: Opcion invalida. Se volvera al menu de inicio");
			}
			} // Fin Switch
		} while (respuesta != 0); // Fin Do While

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

		// numero: numero introducido por el usuario
		double numero = -1;

		// correcto: booleana que comprobara si el resultado introducido es correcto
		boolean correcto = false;

		// Pide al usuario la opcion
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextDouble();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Devuelve el resultado al main
		return numero;

	}

}
