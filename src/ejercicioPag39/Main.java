package ejercicioPag39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pido el numero de alumnos que puede haber en la lista
        System.out.println("Ingrese el número total de alumnos que puede haber en la lista:");
        int capacidad = scanner.nextInt();
        scanner.nextLine(); 

        GestionAlumnos gestionAlumnos = new GestionAlumnos(capacidad);

        //Pido lo que quiere hacer con los alumnos
        int opcion;
        do {
            System.out.println("1-ALTAS");
            System.out.println("2-BAJAS");
            System.out.println("3-LISTAR");
            System.out.println("4-FIN");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del alumno:");
                    String nombreAlta = scanner.nextLine();
                    System.out.println("Ingrese la edad del alumno:");
                    int edadAlta = scanner.nextInt();
                    scanner.nextLine(); 
                    gestionAlumnos.alta(new Alumnos(nombreAlta, edadAlta));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del alumno a eliminar:");
                    String nombreBaja = scanner.nextLine();
                    gestionAlumnos.baja(nombreBaja);
                    break;
                case 3:
                    gestionAlumnos.listar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}