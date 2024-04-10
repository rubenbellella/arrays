package busquedaLineal;

public class BusquedaLineal {

	    public static void main(String[] args) {
	        int[] numeros = {2, 4, 5, 7, 8, 9, 10, 12, 14};
	        int elementoBuscado1 = 9;
	        int elementoBuscado2 = 13;

	        System.out.println(busquedaLineal(numeros, elementoBuscado1)); 
	        System.out.println(busquedaLineal(numeros, elementoBuscado2)); 
	        
	    }
	    
	    
	    public static int busquedaLineal(int[] numeros, int elemento) {
	        for (int pos = 0; pos < numeros.length && numeros[pos]<=elemento; pos++) {
	            if (numeros[pos] == elemento) {
	                return pos;  
	            }
	        }
	        return -1;  
	    }
	}





