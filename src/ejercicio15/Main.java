package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// aleatoriosAGenerar: cantidad de numeros aleatorios a generar
		int aleatoriosAGenerar=0;

		// valorMaximo: valor maximo que tomara el nº aleatorio
		int valorMaximo=0;

		// valorMinimo: valor minimo que tomara el nº aleatorio
		int valorMinimo=0;

		// correcto: booleana que comprobara si el resultado introducido es correcto
		boolean correcto = false;

		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);

		// Pide al usuario una cantidad de numeros aleatorios a generar
		do {
			try {
				System.out.println("Inserta la cantidad de numeros aleatorios a generar");
				aleatoriosAGenerar = sc.nextInt();
				if (aleatoriosAGenerar < 1) {
					System.out.println("ERROR: Cantidad de numeros aleatorios 0 o negativa");
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Como se pedira otro dato, correcto pasara a ser falso otra vez
		correcto = false;

		// Pide al usuario un valor maximo para los numeros aleatorios generados
		do {
			try {
				System.out.println("Inserta el valor maximo para los numeros aleatorios generados");
				valorMaximo = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Como se pedira otro dato, correcto pasara a ser falso otra vez
		correcto = false;

		// Pide al usuario un valor minimo para los numeros aleatorios generados
		do {
			try {
				System.out.println("Inserta el valor maximo para los numeros aleatorios generados");
				valorMinimo = sc.nextInt();
				if (valorMinimo >= valorMaximo) {
					System.out.println("ERROR: Valor minimo mayor o igual que el valor maximo");
				} else {
					correcto = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Dato introducido invalido");
			} finally {
				sc.nextLine();
			}
		} while (!correcto); // Fin Do While

		// Aleatorios solo con la cantidad a generar
		Aleatorios.numerosAleatorios(aleatoriosAGenerar);
		
		// Aleatorios con la cantidad a generar y el valor maximo
		Aleatorios.numerosAleatorios(aleatoriosAGenerar, valorMaximo);
		
		// Aleatorios con los tres valores
		Aleatorios.numerosAleatorios(aleatoriosAGenerar, valorMaximo, valorMinimo);
		
		// Cierra el Scanner
		sc.close();
		
	}

}
