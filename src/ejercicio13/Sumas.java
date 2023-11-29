package ejercicio13;

public class Sumas {

	static int sumaEnteros(int numero) {
		int resultado = 0;
		for (int i = 1; i <= numero; i++) {
			resultado = resultado + i;
		}
		return resultado;
	}

	static int sumaEnteros(int num1, int num2) {
		int resultado = 0;
		int numeroMaximo;
		int numeroMinimo;
		if (num1 > num2) {
			numeroMaximo=num1;
			numeroMinimo=num2;
		} else {
			numeroMaximo=num2;
			numeroMinimo=num1;
		}
		for (int i=numeroMinimo; i <= numeroMaximo; i++) {
			resultado = resultado + i;
		}
		return resultado;
	}

}
