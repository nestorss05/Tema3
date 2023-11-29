package ejercicio14;

public class Booleanos {

	static boolean parseToBoolean (int argumentoEntero) {
		boolean res=false;
		if (argumentoEntero == 1) {
			res=true;
		}
		return res;
	}
	
	static boolean parseToBoolean (String argumentoCadena) {
		boolean res=false;
		if (argumentoCadena.equals("true")) {
			res=true;
		}
		return res;
	}
	
}
