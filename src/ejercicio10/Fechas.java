package ejercicio10;

public class Fechas {

	public static boolean comprobarFechas(int dia, int mes, int año) {

		// resultado: resultado que saldra si el mes y el dia son correctos
		boolean resultado=false;
		
		// If: comprueba si el dia y el mes es correcto
		if (dia>=1 || dia<=30) {
			if (mes>=1 || mes<=12) {
				resultado = true;
			}
		} // Fin If

		// Devuelve esCorrecta al Main
		return resultado;

	}

}
