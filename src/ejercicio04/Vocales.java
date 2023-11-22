package ejercicio04;

public class Vocales {
	
	public static boolean vocales(String caracter, boolean esLocal) {
		
		// esVocal: booleana que te informara si la letra introducida es vocal o no
		boolean esVocal=false;
		
		// If: esVocal solo pasara a ser true si la letra es una vocal
		if ((caracter.equals("a")) || (caracter.equals("e")) || (caracter.equals("i")) || (caracter.equals("o")) || (caracter.equals("u"))) {
				
			esVocal=true;		
		
		} // Fin If
		
		// Se usara un return para esVocal
		return(esVocal);
		
	}
	
}
