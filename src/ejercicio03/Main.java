package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// numeroA: uno de los numeros introducidos por el usuario
		int numeroA = 0;
		
		// numeroB: otro de los numeros introducidos por el usuario
		int numeroB = 0;
		
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario dos numero

		try {
			System.out.println("Inserta un numero");
			numeroA = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es un numero. El valor se establecera en 0.");
		}

		try {
			System.out.println("Inserta otro numero");
			numeroB = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor introducido no es un numero. El valor se establecera en 0.");
		}
		
		// Se le informara al usuario cual es el numero mayor de los tres
		System.out.println(NumeroMayor.numeros(numeroA, numeroB));
		
		// Cierra el scanner
		sc.close();

	}

}
