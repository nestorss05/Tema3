package ejercicio08;

import ejercicio07.Primo;

public class DivisoresPrimos {

	public static int divisoresprimos(int numero, int divisoresPrimos) {

		// Para que las variables coincidan con las del ejercicio 7, se añadira la
		// booleana esPrimo
		boolean esPrimo=false;

		// For para comprobar divisores primos
		for (int n = 1; n <= numero; n++) {
			// If 1 para comprobar si numero es divisible entre n
			if (numero%n==0) {
				// If 2 para comprobar si un numero es primo
				if (Primo.primo(esPrimo, n)) {
					divisoresPrimos++;
				} // Fin If 2
				esPrimo=false;
			} // Fin If 1
		} // Fin For

		// Devuelve el resultado divisoresPrimos al main
		return divisoresPrimos;

	}

}
