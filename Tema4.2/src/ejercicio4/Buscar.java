package ejercicio4;

public class Buscar {

	public static int buscar(int tabla[], int clave) {
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == clave) {
				return i;
			}
		}
		return -1;
	}

}
