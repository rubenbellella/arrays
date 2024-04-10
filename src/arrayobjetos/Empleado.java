package arrayobjetos;

class Empleado {
    String dni;
    String nombre;
    String apellido;
    double sueldo;

    Empleado(String dni, String nombre, String apellido, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }
    
    // Métodos getter para acceder a los atributos
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }
}
