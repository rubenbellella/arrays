package ejercicioPag39;

public class Alumnos {
    //Atributos de la clase Alumno
    private String nombre;
    private int edad;

    //Constructor de la clase Alumno
    public Alumnos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    //Método para establecer el nombre del alumno
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método para obtener la edad del alumno
    public int getEdad() {
        return edad;
    }

    //Método para establecer la edad del alumno
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método para imprimir la información del alumno
    @Override
    public String toString() {
        return "Alumno {" +
                "Nombre: " + nombre +
                " , Edad: " + edad + "}";
    }
}
