package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// altura: altura del cilindro
		double altura = 0;

		// radio: radio del cilindro
		double radio = 0;

		// opcion: opcion elegida para la formula a aplicar
		int opcion = 0;

		// Resultado: resultado final de la operacion
		double resultado = 0;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Do While 1: Pide al usuario la altura
		do {
			try {
				System.out.println("Introduce la altura del cilindro");
				altura = sc.nextInt();
				if (altura < 1) {
					System.out.println("ERROR: El numero introducido tiene que ser positivo");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El numero introducido no es ningun numero.");
				sc.nextLine();
			}
		} while (altura < 1); // Fin Do While 1

		// Do While 2: Pide al usuario la altura
		do {
			try {
				System.out.println("Introduce el radio de la base del cilindro");
				radio = sc.nextInt();
				if (radio < 1) {
					System.out.println("ERROR: El numero introducido tiene que ser positivo");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El numero introducido no es ningun numero.");
				sc.nextLine();
			}
		} while (radio < 1); // Fin Do While 2

		// Do While 3: Pide al usuario la opcion a elegir
		do {
			try {
				System.out.println("1. Area del Cilindro");
				System.out.println("2. Volumen del Cilindro");
				opcion = sc.nextInt();
				if ((opcion != 1) && (opcion != 2)) {
					System.out.println("ERROR: Opcion invalida");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Opcion invalida");
				sc.nextLine();
			}
		} while ((opcion != 1) && (opcion != 2)); // Fin Do While 3

		// El programa continuara por Cilindro
		resultado=Cilindro.cilindro(opcion, altura, radio, resultado);
		
		// Imprime el resultado por pantalla
		System.out.println(resultado);
		
		// Cierra el Scanner
		sc.close();

	}

}
