package ejercicio2;

public class Maximo {

	public static int maximo(int tabla[]) {

		// Variable para guardar el número máximo de la tabla
		int max = 0;

		// Recorremos la tabla con un bule for
		for (int i = 0; i < tabla.length; i++) {
			// Comprobamos uno a uno, y si el número que encuentre es mayor al que se
			// encuentra ya en la variable max, se añade a la variable
			if (tabla[i] > max) {
				max = tabla[i];
			}
		}

		// Devolvemos el número máximo que haya encontrado
		return max;
	}

}
