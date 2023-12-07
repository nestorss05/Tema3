package tema3_ejercicio3_obligatorios;

public class Circulo {

	// radio: radio del triangulo
	double radio;

	// Constructor sin parametros
	public Circulo() {
		super();
	} // Fin constructor sin parametros

	// Constructor con parametros
	public Circulo(double radio) {
		super();
		this.radio = radio;
	} // Fin constructor con parametros

	// Clase circunferencia
	public double circunferencia() {
		// resultado: resultado a devolver al main
		double resultado;

		// Realiza la operacion
		resultado = 2 * Math.PI * radio;

		// Devuelve el resultado al main
		return resultado;
	} // Fin clase circunferencia

	// Clase area
	public double area() {
		// resultado: resultado a devolver al main
		double resultado;
		
		// Realiza la operacion
		resultado = Math.PI * Math.pow(radio, 2);
		
		// Devuelve el resultado al main
		return resultado;
	} // Fin clase area

}
