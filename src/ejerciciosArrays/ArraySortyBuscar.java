package ejerciciosArrays;

import java.util.Arrays;

public class ArraySortyBuscar {

	public static void main(String[] args) {
		
		String [] palabras = {"hola","adios","uno","dos","tres","cuatro","cinco","seis","siete","ocho"};
		
		Arrays.sort(palabras);
		for(String palabra: palabras)
			System.out.println(palabra+"|");
		
		Arrays.binarySearch(palabras, "cinco");
	
	}

}
