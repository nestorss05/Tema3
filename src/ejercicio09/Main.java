package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// numeroA: primer numero introducido por el usuario
		double numeroA = 0;

		// numeroB: segundo numero introducido por el usuario
		double numeroB = 0;

		// opcion: opcion elegida por el usuario
		int opcion = 0;

		// operacion: suma, resta, multiplicacion o division
		String operacion = "0";

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario un numero
		try {
			System.out.println("Inserta un numero");
			numeroA = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El formato del numero es incorrecto. Se establecera el valor en 0");
			sc.nextLine();
		}

		// Pide al usuario otro numero
		try {
			System.out.println("Inserta otro numero");
			numeroB = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El formato del numero es incorrecto. Se establecera el valor en 0");
			sc.nextLine();
		}

		// Haz que el usuario elija la opcion
		do {
			try {
				System.out.println("1. SUMAR");
				System.out.println("2. RESTAR");
				System.out.println("3. MULTIPLICAR");
				System.out.println("4. DIVIDIR");
				opcion = sc.nextInt();
				if (opcion < 1 || opcion > 4) {
					System.out.println("ERROR: Opcion invalida");
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Opcion invalida");
				sc.nextLine();
			}
		} while (opcion < 1 || opcion > 4);

		// La opcion definira la operacion
		switch (opcion) {
		case 1 -> {
			operacion="+";
		}
		case 2 -> {
			operacion="-";
		}
		case 3 -> {
			operacion="*";
		}
		case 4 -> {
			operacion="/";
		}
		}

		// El codigo seguira por Calculadora
		System.out.println(numeroA+""+operacion+""+numeroB+"="+Calculadora.calculos(numeroA, numeroB, opcion));

		// Cierra el Scanner
		sc.close();

	}

}
