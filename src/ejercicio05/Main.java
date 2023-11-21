package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// numero: numero introducido por el usuario
		int numero=0;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Do While: Pide al usuario un numero
		do {
			try {
				System.out.println("Inserta un numero");
				numero = sc.nextInt();
				if (numero<1) {
					System.out.println("ERROR: El numero introducido tiene que ser positivo");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El numero introducido no es ningun numero.");
				sc.nextLine();
			}
		} while (numero<1); // Fin Do While
		
		// El programa continuara en TablaMultiplicar
		TablaMultiplicar.tablaMultiplicar(numero);
		
		// Cierra el Scanner
		sc.close();
		
	}

}
