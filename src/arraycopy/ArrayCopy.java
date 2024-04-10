package arraycopy;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	    public static void main(String[] args) {
	        //Definir el primer array
	        int[] arrayOriginal = {3, 10, 5, 7, 14, 20, 83};

	        //Pedir al usuario la posición inicial y final
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la posición inicial: ");
	        int inicio = scanner.nextInt();
	        System.out.print("Ingrese la posición final: ");
	        int fin = scanner.nextInt();

	        //Copiar elementos a otro array y visualizar el resultado
	        int[] arrayCopiado = Arrays.copyOfRange(arrayOriginal, inicio, fin + 1);
	        System.out.println("Array copiado: " + Arrays.toString(arrayCopiado));

	        //Hacer una copia exacta del primer array en otro tercer array
	        int[] arrayCopiaExacta = Arrays.copyOf(arrayOriginal, arrayOriginal.length);

	        //Visualizar el resultado de comparar el primero con el segundo
	        System.out.println("Comparación entre el primer y segundo array: " + Arrays.equals(arrayOriginal, arrayCopiado));

	        //Visualizar el resultado de comparar el primero con el tercero
	        System.out.println("Comparación entre el primer y tercer array: " + Arrays.equals(arrayOriginal, arrayCopiaExacta));

	        //Pedir un número al usuario y rellenar todos los elementos del tercer array con ese número
	        System.out.print("Ingrese un número para rellenar el tercer array: ");
	        int numeroUsuario = scanner.nextInt();
	        Arrays.fill(arrayCopiaExacta, numeroUsuario);

	        //Visualizar el tercer array después de la modificación
	        System.out.println("Tercer array después de rellenar con el número ingresado: ");
	        System.out.println(Arrays.toString(arrayCopiaExacta)); 
	    }
	}

