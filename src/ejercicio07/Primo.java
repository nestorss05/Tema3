package ejercicio07;

public class Primo {

	public static boolean primo(boolean esPrimo, int n) {

		// Si el resto de n/2 no es 0, si n no es 1, o si n es 2 esPrimo sera true
		if ((n % 2 != 0 && n != 1) || n==2) {
			esPrimo = true;
		} // Fin If

		// Devuelve esPrimo al main
		return esPrimo;

	}

}
