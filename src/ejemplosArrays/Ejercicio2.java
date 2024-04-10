package ejemplosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		String[]nombres = new String [10];
        Scanner scanner = new Scanner(System.in);
        //Pido que ingrese los nombres
        System.out.println("Introduce los nombres:");
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Nombres almacenados en el array:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
	}
}

