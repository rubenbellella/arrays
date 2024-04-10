package ordenarBurbuja;

import java.util.Arrays;

public class OrdenarBurbuja {

	public static void main(String[] args) {
		
		int[] array = {5,7,1,54,20,13,4,8};
		
		ordenarBurbuja(array);
		System.out.println(Arrays.toString(array));
	}

	private static void ordenarBurbuja(int[] array) {
		int aux;
		
		for (int i=array.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				
				if (array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
		}
	}
}
