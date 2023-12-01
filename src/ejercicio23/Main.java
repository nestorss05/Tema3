package ejercicio23;

import java.util.InputMismatchException;
import java.util.Scanner;

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
			// Para elegir la opcion se llamara a menu();
			opcion = menu();

			// If: si opcion es 0, se hara un break
			if (opcion == 0) {
				break;
			}

			// Para insertar el radio se llamara a pideRadio();
			radio = pideRadio();

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
