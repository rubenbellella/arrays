package ejercicioPag41;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creamos un array vacío para almacenar los módulos
        String[] modulos = new String[0]; 

        boolean salir = false;
        while (!salir) {
            //Mostramos el menú de opciones al usuario
            System.out.println("Menú:");
            System.out.println("1. Insertar");
            System.out.println("2. Borrar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt(); 

            switch (opcion) {
                case 1:
                    //Insertar un numero
                    System.out.print("Introduce el modulo a insertar: ");
                    scanner.nextLine(); 
                    String moduloAInsertar = scanner.nextLine();
                    //Verificamos si el numero ya existe en el array
                    if (!contieneModulo(modulos, moduloAInsertar)) {
                        //Si no existe, redimensionamos el array y lo insertamos
                        modulos = Arrays.copyOf(modulos, modulos.length + 1);
                        modulos[modulos.length - 1] = moduloAInsertar;
                        System.out.println("Modulo insertado correctamente.");
                    } else {
                        System.out.println("El modulo ya existe en el array.");
                    }
                    break;
                case 2:
                    //Borrar un numero
                    System.out.print("Introduce el modulo a borrar: ");
                    scanner.nextLine(); 
                    String moduloABorrar = scanner.nextLine();
                    //Verificamos si el numero existe en el array
                    if (contieneModulo(modulos, moduloABorrar)) {
                        //Si existe, lo eliminamos del array
                        modulos = eliminarModulo(modulos, moduloABorrar);
                        System.out.println("Modulo borrado correctamente.");
                    } else {
                        System.out.println("El modulo no existe en el array.");
                    }
                    break;
                case 3:
                    //Salir del programa
                    salir = true;
                    //Ordenamos los numeros y los mostramos
                    Arrays.sort(modulos);
                    System.out.println("Modulo ordenados: " + Arrays.toString(modulos));
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close(); 
    }

    //Método para verificar si un numero está presente en el array
    private static boolean contieneModulo(String[] array, String modulo) {
        for (String item : array) {
            if (item != null && item.equals(modulo)) {
                return true;
            }
        }
        return false;
    }

    //Método para eliminar un numero del array
    private static String[] eliminarModulo(String[] array, String modulo) {
        String[] nuevoArray = new String[array.length - 1];
        int indice = 0;
        for (String item : array) {
            if (item != null && !item.equals(modulo)) {
                nuevoArray[indice++] = item;
            }
        }
        return nuevoArray;
    }
}


