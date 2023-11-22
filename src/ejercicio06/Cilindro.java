package ejercicio06;

public class Cilindro {

	public static double cilindro(int opcion, double altura, double radio, double resultado) {
	
		// If-Else
		if (opcion==1) {
			// Opcion 1: Area del cilindro
			System.out.println("Opcion elegida: 1. Area del Cilindro");
			resultado=(2 * Math.PI) * (altura * radio);
		} else {
			// Opcion 2: Volumen del cilindro
			System.out.println("Opcion elegida: 2. Volumen del Cilindro");
			resultado=Math.PI * Math.pow(radio, 2) * altura;
		} // Fin If-Else
		
		// Devuelve resultado al Main
		return resultado;
		
	}

}
