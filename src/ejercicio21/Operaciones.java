package ejercicio21;

public class Operaciones {

	// num1: numero que viene de la clase Main
	double num1;

	// num2: numero que viene de la clase Main
	double num2;

	// Constructor sin parametros
	public Operaciones() {
		super();
	}
	
	// Operaciones: establecera los valores de los numeros traidos del Main hacia
	// los valores de los numeros en esta clase
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// suma: funcion que devuelve la suma de los dos numeros introducidos
	public double suma() {
		return num1 + num2;
	}

	// resta: funcion que devuelve la resta de los dos numeros introducidos
	public double resta() {
		return num1 - num2;
	}

	// multiplicacion: funcion que devuelve la multiplicacion de los dos numeros
	// introducidos
	public double multiplicacion() {
		return num1 * num2;
	}

	// division: funcion que devuelve la division de los dos numeros introducidos
	public double division() {
		return num1 / num2;
	}

	// maximo: funcion que devolvera el numero mas grande de los dos
	public double maximo() {
		double numero = num2;
		if (num1 > num2) {
			numero = num1;
		}
		return numero;
	}

	// minimo: funcion que devolvera el numero mas pequeño de los dos
	public double minimo() {
		double numero = num2;
		if (num1 < num2) {
			numero = num1;
		}
		return numero;
	}

}
