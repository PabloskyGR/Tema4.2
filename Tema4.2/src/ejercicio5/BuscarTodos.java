package ejercicio5;

public class BuscarTodos {

	public static int[] buscarTodos(int tabla[], int num) {
		
		int cont = 0;
		
		int indice = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == num) {
				cont++;
			}
		}

		int[] posiciones = new int[cont];
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == num) {
				posiciones[indice] = i;
				indice++;
			}
		}

		return posiciones;
	}

}
