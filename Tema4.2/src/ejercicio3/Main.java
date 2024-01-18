package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos el tamaño de la tabla
		int longitud;

		// Variable donde guardaremos el número maximo que tendrá los valores
		int fin;

		// Variable donde guardaremos la tabla
		int tabla[];

		// Le pedimos al usuario el tamaño de la tabla que quiere
		System.out.println("Dime de que tamaño quieres que sea la tabla: ");
		longitud = sc.nextInt();

		// Le pedimos al usuario que número máximo quiere que sean los valores
		System.out.println("Dime hasta que número quieres que llegue los valores: ");
		fin = sc.nextInt();

		// Llamamos a la función que crea la tabla y le damos la tabla a la variable
		// 'tabla'
		tabla = Pares.pares(longitud, fin);

		// Mostramos la tabla con los números pares
		System.out.println("La tabla con números pares: " + Arrays.toString(tabla));

		// Ordenamos la tabla
		Arrays.sort(tabla);

		// Mostramos lo mismo pero ordenada
		System.out.println("La tabla con números pares ordenada: " + Arrays.toString(tabla));

		// Cerramos el scanner
		sc.close();

	}

}
