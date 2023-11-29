package ejercicio15;

public class Aleatorios {

	static void numerosAleatorios(int aleatoriosAGenerar) {

		// Se generaran numeros aleatorios entre 0 y 1, con la cantidad especificada
		// anteriormente
		System.out.println("Aleatorios solo con la cantidad de aleatorios a generar");
		for (int i = 1; i <= aleatoriosAGenerar; i++) {
			System.out.println(Math.random() * 1);
		} // Fin For

	}

	static void numerosAleatorios(int aleatoriosAGenerar, int valorMaximo) {

		// Se generaran numeros aleatorios entre 0 y el valor maximo establecido. La
		// cantidad de numeros aleatorios fue establecida anteriormente
		System.out.println("Aleatorios con la cantidad de aleatorios a generar y con valor maximo");
		for (int i = 1; i <= aleatoriosAGenerar; i++) {
			System.out.println(Math.random() * valorMaximo);
		} // Fin For

	}

	static void numerosAleatorios(int aleatoriosAGenerar, int valorMaximo, int valorMinimo) {

		// Se generaran numeros aleatorios entre los valores establecidos anteriormente
		// junto con la cantidad de numeros aleatorios
		System.out.println("Aleatorios con los tres valores");
		for (int i = 1; i <= aleatoriosAGenerar; i++) {
			System.out.println(Math.random() * (valorMaximo - valorMinimo) + valorMinimo);
		} // Fin For

	}

}
