package ejercicio02;

public class Numeros {

	public static void numeros(int numeroA, int numeroB) {
		
		// If-Else
		if (numeroA>numeroB) {
			// Resultado si el primer numero es mayor que el segundo
			for (int i=numeroB; i<=numeroA; i++) {
				System.out.println(i);
			}
		} else {
			// Resultado si el segundo numero es mayor o igual que el primero
			for (int i=numeroA; i<=numeroB; i++) {
				System.out.println(i);
			}
		} // Fin If-Else
		
	}
	
}
