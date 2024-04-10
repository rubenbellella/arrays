package ejemplosArrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Crear una instancia de la clase ArrayIncremento
        Ejercicio4 arrayIncremento = new Ejercicio4();
        
        //Pedir al usuario el porcentaje de incremento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el porcentaje de incremento: ");
        double porcentaje = scanner.nextDouble();
        
        //Incrementar y mostrar el array
        arrayIncremento.incrementarArray(porcentaje);
    }

    	//Método para inicializar el array y mostrar cada elemento incrementado en un porcentaje dado
		public void incrementarArray(double porcentaje) {
        //Inicializar un array de 10 números de tipo double
        double[] numeros = new double[10];
        
        //Inicializar el array con valores 
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1; 
        }

        //Recorrer el array y mostrar cada elemento incrementado en el porcentaje dado
        System.out.println("Array original:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("Array incrementado en " + porcentaje + "%:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] += numeros[i] * (porcentaje / 100);
        }

        for (double numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}