package ejercicio03;

public class NumeroMayor {

	public static int numeros(int numeroA, int numeroB) {
		
		// numeroMayor: el numero mayor de los dos
		int numeroMayor;
		
		// If-Else
		if (numeroA>numeroB) {
			// Si numeroA es mayor que numeroB
			numeroMayor=numeroA;
		} else {
			// Si numeroB es mayor o igual que numeroA
			numeroMayor=numeroB;
		} // Fin If-Else
		
		// Se usara un return para numeroMayor
		return(numeroMayor);
		
	}
	
}
