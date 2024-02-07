package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		int[] tabla = { 1, 2, 3, 4, 5, 4, 1, 6, 9, 7 };
		
		System.out.println("Dime el número que quieres buscar:");
		num = sc.nextInt();
		
        int[] posiciones = BuscarTodos.buscarTodos(tabla, num);
        
        if (posiciones.length > 0) {
            System.out.println("El número " + num + " se encuentra en las posiciones: " + Arrays.toString(posiciones));
        } else {
            System.out.println("El número " + num + " no se encuentra en la tabla.");
        }
        
        sc.close();

	}

}
