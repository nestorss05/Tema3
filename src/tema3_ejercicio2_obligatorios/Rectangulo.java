package tema3_ejercicio2_obligatorios;

public class Rectangulo {

	// alto: altura que viene de la clase Main
	double alto;

	// ancho: ancho que viene de la clase Main
	double ancho;

	// Constructor sin parametros
	public Rectangulo() {
		super();
	} // Fin constructor sin parametros

	// Constructor con parametros
	public Rectangulo(double alto, double ancho) {
		super();
		
		// Los atributos seran los datos respectivos del Main
		this.alto = alto;
		this.ancho = ancho;
	} // Fin constructor con parametros

	// Clase perimetro
	public double perimetro() {
		// resultado = resultado a devolver al main
		double resultado;
		
		// Realiza la operacion
		ancho = ancho * 2;
		alto = alto * 2;
		resultado = ancho + alto;
		
		// Devuelve resultado al main
		return resultado;
	} // Fin clase perimetro

	// Clase area
	public double area() {
		// resultado = resultado a devolver al main
		double resultado;
		
		// Realiza la operacion
		resultado = ancho * alto;
		
		// Devuelve resultado al main
		return resultado;
	} // Fin clase area

}
