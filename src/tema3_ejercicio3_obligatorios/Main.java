package tema3_ejercicio3_obligatorios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * radio: 5, respuesta: 1 | Esperaba: 31.41592653589793 | Resultado: 31.41592653589793
 * 
 * radio: 5, respuesta: 2 | Esperaba: 78.53981633974483 | Resultado: 78.53981633974483
 * 
 * radio: 5, respuesta: 0 | Esperaba: Salida del programa | Resultado: Salida del programa
 * 
 * radio: aaa | Esperaba: Respuesta invalida | Resultado: Respuesta invalida
 * 
 * radio: 5, respuesta: aaa | Esperaba: Respuesta invalida | Resultado: Respuesta invalida
 * 
 */

public class Main {

	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// opcion: opcion elegida en menu()
		int opcion = 3;

		// radio: radio introducido en pideRadio()
		double radio;

		// Do While: llamara a las funciones
		do {

			// Para insertar el radio se llamara a pideRadio();
			radio = pideRadio();

			// Para elegir la opcion se llamara a menu();
			opcion = menu();

			// If: si opcion es 0, se hara un break
			if (opcion == 0) {
				break;
			}
			
			// Se definira circ para la clase Circulo
			Circulo circ = new Circulo(radio);

			// If-Else: se ejecutara una funcion o otra dependiendo de la opcion
			if (opcion == 1) {
				// Circunferencia
				System.out.println(circ.circunferencia());
			} else {
				// Area
				System.out.println(circ.area());
			} // Fin If-Else

		} while (opcion != 0); // Fin Do While

		// Cierra el Scanner
		sc.close();

	}

	public static int menu() {
		// opcion: opcion elegida por el usuario
		int opcion = 3;

		// Muestra el menu
		System.out.println("1. Circunferencia");
		System.out.println("2. Area");
		System.out.println("0. Salir");

		// Do While: pide al usuario la opcion
		do {
			try {
				opcion = sc.nextInt();
				if (opcion < 0 || opcion > 2) {
					System.out.println("ERROR: Respuesta invalida");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (opcion < 0 || opcion > 2); // Fin Do While

		// Devuelve opcion al main
		return opcion;
	}

	public static double pideRadio() {
		// opcion: opcion elegida por el usuario
		int numero = 3;

		// correcto: comprueba si es correcto
		boolean correcto = false;

		// Do While: pide al usuario el radio
		do {
			try {
				System.out.println("Inserta el radio");
				numero = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Devuelve opcion al main
		return numero;
	}

}
