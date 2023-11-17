package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numeroA; 
		int numeroB;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario dos numero
		
		try {
			System.out.println("Inserta un numero");
			numeroA = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es un numero");
		}
		
		try {
			System.out.println("Inserta otro numero");
			numeroB = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es un numero");
		}
		
		// Aqui ira la continuacion del codigo
		
		// Cierra el Scanner
		sc.close();
		
	}

}
