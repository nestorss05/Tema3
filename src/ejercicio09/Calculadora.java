package ejercicio09;

public class Calculadora {
	
	public static double calculos (double numeroA, double numeroB, int opcion) {
		// resultado: resultado total de la operacion
		double resultado=0;
		
		// Switch
		switch (opcion) {
		case 1 -> {
			resultado=numeroA+numeroB;
		}
		case 2 -> {
			resultado=numeroA-numeroB;
		}
		case 3 -> {
			resultado=numeroA*numeroB;
		}
		case 4 -> {
			resultado=numeroA/numeroB;
		}
		} // Switch
		
		// Devuelve el resultado
		return(resultado);
	}
	
}
