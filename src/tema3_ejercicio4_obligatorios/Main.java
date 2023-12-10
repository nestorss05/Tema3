package tema3_ejercicio4_obligatorios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Ejemplo:
 * 
 * radio: 5, altura: 8, respuesta: 1 | Esperaba: 628.3185307179587 | Resultado: 628.3185307179587
 * 
 * radio: 5, altura: 8, respuesta: 2 | Esperaba: 130.0 | Resultado: 130.0
 * 
 * radio: 5, altura: 8, respuesta: 0 | Esperaba: Salida del programa | Resultado: Salida del programa
 * 
 * radio: aaa | Esperaba: Respuesta invalida | Resultado: Respuesta invalida
 * 
 * radio: 5, altura: 8, respuesta: aaa | Esperaba: Respuesta invalida | Resultado: Respuesta invalida
 * 
 */

public class Main {

	// Inicia el Scanner
	public static Scanner sc = new Scanner(System.in);

	// Funcion Main
	public static void main(String[] args) {

		// radio: radio introducido por el usuario
		double radio;
		
		// altura: altura introducida por el usuario
		double altura;
		
		// respuesta: opcion introducida por el usuario
		int respuesta = 3;
		
		do {
			// Inicia pideRadioBase()
			radio = pideRadioBase();
			
			// Inicia altura()
			altura = altura();

			// Muestra el menu
			respuesta = menu();
			
			// If: Si la respuesta es 0, se hara un break
			if (respuesta == 0) {
				break;
			} // Fin If
			
			// Se definira cili para la clase Cilindro
			Cilindro cili = new Cilindro(radio, altura);
			
			// If-Else: se ejecutara una funcion dependiendo de la opcion seleccionada
			if (respuesta == 1) {
				// Volumen
				System.out.println(cili.volumen());
			} else {
				// Area
				System.out.println(cili.area());
			} // Fin If-Else
			
		} while (respuesta != 0);

		// Cierra el Scanner
		sc.close();

	} // Fin Funcion Main

	// Funcion menu
	public static int menu() {
		// respuesta: respuesta que introducira el usuario
		int respuesta = -1;

		// Muestra el menu
		System.out.println("1. Volumen");
		System.out.println("2. Area");
		System.out.println("0. Salir");

		// Pide al usuario la respuesta
		do {
			try {
				respuesta = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta incorrecta");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
			if (respuesta < 0 || respuesta > 2) {
				System.out.println("ERROR: Respuesta incorrecta");
			} // Fin If
		} while (respuesta < 0 || respuesta > 2);

		// Devuelve respuesta al Main
		return respuesta;
	} // Fin funcion menu

	// Funcion pideRadioBase
	public static double pideRadioBase() {
		// radio: radio que introducira el usuario
		int radio = 0;

		// correcto: booleano que comprobara que todo este correcto
		boolean correcto = false;

		// Pide al usuario el radio
		do {
			try {
				System.out.println("Inserta el radio del cilindro");
				radio = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta incorrecta");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!correcto);

		// Devuelve radio al main
		return radio;
	} // Fin funcion pideRadioBase

	public static double altura() {
		// altura: altura que introducira el usuario
		int altura = 0;

		// correcto: booleano que comprobara que todo este correcto
		boolean correcto = false;

		// Pide al usuario el radio
		do {
			try {
				System.out.println("Inserta la altura del cilindro");
				altura = sc.nextInt();
				correcto = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Respuesta incorrecta");
			} finally {
				sc.nextLine();
			} // Fin Try Catch
		} while (!correcto);

		// Devuelve radio al main
		return altura;
	}

} // Fin Clase
