package ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// caracter: caracter introducido por el usuario
		String caracter;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pide al usuario una letra
		System.out.println("Inserta una letra");
		caracter = sc.nextLine().toLowerCase();
		
		// Comprueba si la respuesta es realmente una letra
		switch (caracter) {
		
		case "a", "e", "i", "o", "u", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" -> {
			// Caso de ser una letra: El programa le informara si tu letra es vocal o no
			System.out.println(Vocales.vocales(caracter)); 
		}
		
		default -> {
			// Default: el programa no podra continuar porque la respuesta no es una letra
			System.out.println("La respuesta introducida no es una letra. El programa procedera a terminarse");
		}
		
		}
		
		// Cierra el Scanner
		sc.close();
		
	}

}
