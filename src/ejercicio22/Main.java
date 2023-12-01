package ejercicio22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);

	// Main
	public static void main(String[] args) {

		// respuesta: opcion introducida por el usuario
		int respuesta;

		// ancho: ancho de un rectangulo
		double ancho;

		// alto: altura de un rectangulo
		double alto;

		// Do While: se iran iniciando las otras funciones 
		do {
			// respueta sera la opcion elegida en menu()
			respuesta = menu();

			// If: si respueta es 0, se hara un break
			if (respuesta == 0) {
				break;
			}

			// ancho sera el ancho elegido en pideAncho()
			ancho = pideAncho();

			// alto sera el alto elegido en pideAlto
			alto = pideAlto();

			// Se definira rec para la clase Rectangulo
			Rectangulo rec = new Rectangulo(ancho, alto);
			
			// Se procedera a hacer la operacion dependiendo de la opcion elegida
			if (respuesta == 1) {
				// Perimetro
				System.out.println(rec.perimetro());
			} else {
				// Area
				System.out.println(rec.area());
			}
			
		} while (respuesta != 0); // Fin Do While

		// Cierra el Scanner
		sc.close();

	}

	public static int menu() {

		// opcion: opcion elegida por el usuario
		int opcion = -1;

		// Muestra el menu
		System.out.println("1. Perimetro");
		System.out.println("2. Area");
		System.out.println("0. Salir");

		// Do While: Pide al usuario la opcion a elegir
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

	// Pide el ancho al usuario
	public static double pideAncho() {
		// correcto: comprueba si la respuesta es correcta o no
		boolean correcto = false;

		// opcion: opcion elegida por el usuario
		double respuesta = 0;

		// Do While: Pide al usuario el ancho
		do {
			try {
				System.out.println("Inserta el ancho del rectangulo");
				respuesta = sc.nextDouble();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Devuelve opcion al main
		return respuesta;
	}

	// Pide la altura al usuario
	public static double pideAlto() {
		// correcto: comprueba si la respuesta es correcta o no
		boolean correcto = false;

		// opcion: opcion elegida por el usuario
		double respuesta = 0;

		// Do While: Pide al usuario el ancho
		do {
			try {
				System.out.println("Inserta la altura del rectangulo");
				respuesta = sc.nextDouble();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Devuelve opcion al main
		return respuesta;
	}

}
