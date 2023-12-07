package tema3_ejercicio4_obligatorios;

public class Cilindro {

	double radioBase;
	double altura;

	// Constructor con parametros
	public Cilindro(double radioBase, double altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	} // Fin constructor con parametros

	// Constructor sin parametros
	public Cilindro() {
		super();
		// TODO Auto-generated constructor stub
	} // Fin constructor sin parametros

	public double volumen() {
		// resultado: resultado de la operacion
		double resultado;

		// El resultado se guaradara en la variable resultado
		resultado = (Math.PI * Math.pow(radioBase, 2) * altura);

		// Devuelve resultado al main
		return resultado;
	}

	public double area() {
		// resultado: resultado de la operacion
		double resultado;

		// El resultado se guaradara en la variable resultado
		resultado = (2 * radioBase * (altura + radioBase));

		// Devuelve resultado al main
		return resultado;
	}

}
