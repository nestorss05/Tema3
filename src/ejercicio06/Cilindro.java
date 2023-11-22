package ejercicio06;

public class Cilindro {

	public static double cilindro(int opcion, double altura, double radio) {

		// Resultado: resultado final de la operacion
		double resultado;
		
		if (opcion==1) {
			System.out.println("Opcion elegida: 1. Area del Cilindro");
			resultado=(2 * Math.PI) * (altura * radio);
		} else {
			System.out.println("Opcion elegida: 2. Volumen del Cilindro");
			resultado=Math.PI * Math.pow(radio, 2) * altura;
		}
		
		return resultado;
		
	}

}
