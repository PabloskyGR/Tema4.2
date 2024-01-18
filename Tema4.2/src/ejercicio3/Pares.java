package ejercicio3;

public class Pares {

	public static int[] pares(int longitud, int inicio) {

		// Creamos la tabla con la longitud introducida por parámetro
		int tabla[] = new int[longitud];

		// Variable donde guardaremos los números pares que vayamos añadiendo a la tabla
		int num;

		// Con un bucle for vamos recorriendo la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Generamos un número aleatorio a la variable num
			num = (int) (Math.random() * inicio + 1);

			// Comprobamos si el número es par y no es 0, en caso afirmativo añadimos ese
			// número a la tabla
			if (num % 2 == 0 && num != 0) {
				tabla[i] = num;
				// En caso de que volvemos a repetir paara buscar un número positivo
			} else {
				i--;
			}
		}

		// Devolvemos la tabla
		return tabla;
	}
}
