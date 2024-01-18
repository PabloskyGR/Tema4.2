package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable que nos servira para guardar la tabla que queremos
		int tabla[];

		// Variable donde guardaremos el tamaño que tendrá la tabla, que introducira el
		// usuario
		int longitud;

		// Variable donde guardaremos el número maximo que se podrá generar como valor
		// para las posiciones de la tabla, que inrtoducirá el usuario
		int maximo;

		// Le pedimos al usuario que tamaño quiere para la tabla
		System.out.println("Dime que tamaño quieres que tenga la tabla:");
		longitud = sc.nextInt();

		// Le pedimos al usuario también el número máximo que se generará
		System.out.println("Dime el número máximo que haya en la tabla:");
		maximo = sc.nextInt();

		// Creamos la tabla con el tamaño que haya intriducido el usuario
		tabla = new int[longitud];

		// Usando un bucle for vamos recorriendo la tabla y añadiendole valores
		// aleatorios a las posiciones
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * maximo + 1);
		}

		// Mostramos como ha quedado la tabla
		System.out.println("Esta es la tabla que se ha formado: " + Arrays.toString(tabla));

		// Llamamos a la función maximo, y mostramos el número maximo de la tabla
		System.out.println("El número máximo de la tabla es: " + Maximo.maximo(tabla));

		// Cerramos el scanner
		sc.close();

	}

}
