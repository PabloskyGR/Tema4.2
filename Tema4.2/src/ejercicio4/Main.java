package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] tabla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int clave;
		
		int posicion;

		System.out.println("Dime el número que quieres buscar");
		clave = sc.nextInt();

		posicion = Buscar.buscar(tabla, clave);

		if (posicion != -1) {
			System.out.println("El número " + clave + " se encuentra en la posición " + posicion + ".");
		} else {
			System.out.println("El número " + clave + " no se encuentra en la tabla.");
		}

		sc.close();

	}

}
