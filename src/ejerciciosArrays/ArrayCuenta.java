package ejerciciosArrays;

import java.util.Scanner;

public class ArrayCuenta {

	
	public static void main(String[] args) {
        //Crear una instancia de la clase ArrayCuenta
		ArrayCuenta arrayCuenta = new ArrayCuenta();

        //Llamar al método para introducir numeros
        arrayCuenta.introducirNumeros();

        //Llamar al método para contar los números
        arrayCuenta.contabilizarNumeros();
    }
	
	
	//Array de 10 numeros inicializados a 0
	int[] numeros = new int[10];
   
    //Método para solicitar al usuario que introduzca cada elemento del array
    public void introducirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los elementos del array:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    //Método que contabiliza el total de números positivos, negativos y 0 del array
    public void contabilizarNumeros() {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Total de números positivos: " + positivos);
        System.out.println("Total de números negativos: " + negativos);
        System.out.println("Total de ceros: " + ceros);
    }

    
}
           
	

