package ejemplosArrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declarar el array de 10 números decimales
        float[] numeros = new float[10];

        //Crear un Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //Solicitar al usuario que introduzca cada número
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextFloat();
        }

        //Calcular la media aritmética
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }

        float media = suma / 10;

        //Mostrar la media aritmética
        System.out.println("La media aritmética es: " + media);
        
        scanner.close();
	}
}
