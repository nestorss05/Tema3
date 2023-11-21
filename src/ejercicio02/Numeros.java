package ejercicio02;

public class Numeros {

	public static void numeros(int numeroA, int numeroB) {
		
		if (numeroA>numeroB) {
			for (int i=numeroB; i<=numeroA; i++) {
				System.out.println(i);
			}
		} else {
			for (int i=numeroA; i<=numeroB; i++) {
				System.out.println(i);
			}
		}
		
	}
	
}
