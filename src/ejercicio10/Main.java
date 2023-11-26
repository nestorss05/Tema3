package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// dia: dia de la fecha
		int dia = 0;

		// mes: mes de la fecha
		int mes = 0;

		// año: año de la fecha
		int año = 0;
		
		// esCorrecta: booleana que te informara si la fecha esta bien o no
		boolean esCorrecta = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario el dia
		try {
			System.out.println("Inserta el dia");
			dia = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}

		// Pide al usuario el mes
		try {
			System.out.println("Inserta el mes");
			mes = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}

		// Pide al usuario el año
		try {
			System.out.println("Inserta el año");
			año = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El dia esta mal introducido");
			sc.nextLine();
		}

		// La fecha se comprobara si esta bien o no en comprobarFechas
		esCorrecta = Fechas.comprobarFechas(dia, mes, año);
		
		// Informale al usuario si la fecha es correcta o no
		System.out.println(esCorrecta);

		// Cierra el Scanner
		sc.close();

	}

}
