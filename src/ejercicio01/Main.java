package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// n: numero introducido por el usuario que seran las veces que se repetira la
		// frase "Eco..."
		int n = 0;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario un numero
		try {
			System.out.println("Escribe un numero");
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor no es ningun numero");
		}
		
		// Se ejecutara la clase Eco
		Eco.eco(n);
		
		// Cierra el Scanner
		sc.close();

	}

}
