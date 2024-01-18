package ejercicio1;

public class Suma {

	public static int suma(int tabla[]) {
		// Variable donde guardaremos la suma de todos los números de la tabla
		int suma = 0;

		// Recorremos la tabla y vamos sumando todos sus valores a la variable suma
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}

		// Devolvemos el número máximo
		return suma;
	}

}
