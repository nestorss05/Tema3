package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// n: numero introducido por el usuario
		int n=0;
		
		// esPrimo: un booleano que informara si el numero es primo o no
		boolean esPrimo=false;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Do While: Pide al usuario un numero
		do {
			try {
				System.out.println("Inserta un numero");
				n = sc.nextInt();
				if (n<1) {
					System.out.println("ERROR: El numero debe ser positivo");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El dato introducido no es ningun numero");
			}
		} while (n<1); // Fin Do While
		
		// Se continuara en Primo para asignarlo a esPrimo
		esPrimo=Primo.primo(esPrimo, n);
		
		// Muestra el resultado por pantalla
		System.out.println(esPrimo);
		
		// Cierra el Scanner
		sc.close();
		
	}

}
