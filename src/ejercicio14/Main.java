package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// argumentoEntero: argumento true/false en forma de entero
		int argumentoEntero = -1;

		// argumentoCadena: argumento true/false en forma de cadena
		String argumentoCadena = "a";

		// correcto: booleana que comprobara si el resultado introducido es correcto
		boolean correcto = false;

		// resultado: resultado que sale de las funciones
		boolean resultado;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While: Pide al usuario el argumento entero
		do {
			try {
				System.out.println("Inserta un 0 o un 1");
				argumentoEntero = sc.nextInt();
				if (argumentoEntero != 0 && argumentoEntero != 1) {
					System.out.println("ERROR: Numero invalido");
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta invalida");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Como se pedira otro dato, correcto pasara a ser falso otra vez
		correcto = false;

		// Do While: Pide al usuario el argumento cadena
		do {
			System.out.println("Inserta un true o un false");
			argumentoCadena = sc.nextLine();
			if (!argumentoCadena.equals("false") && !argumentoCadena.equals("true")) {
				System.out.println("ERROR: Dato invalido");
			} else {
				correcto = true;
			}
		} while (!correcto); // Fin Do While

		// El resultado del argumento entero se guardara en resultado y se mostrara por
		// pantalla
		resultado = Booleanos.parseToBoolean(argumentoEntero);
		System.out.println("Resultado del argumento entero: " + resultado);

		// El resultado del argumento cadena se guardara en resultado y se mostrara por
		// pantalla
		resultado = Booleanos.parseToBoolean(argumentoCadena);
		System.out.println("Resultado del argumento cadena: " + resultado);

		// Cierra el Scanner
		sc.close();

	}

}
