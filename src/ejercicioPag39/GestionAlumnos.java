package ejercicioPag39;

class GestionAlumnos {
	//Array para almacenar los alumnos
    private Alumnos[] listaAlumnos;
    //Atributos
    private int capacidad; 
    private int contador; 

    //Constructor que inicializa la lista de alumnos con la capacidad especificada
    public GestionAlumnos(int capacidad) {
        this.capacidad = capacidad;
        listaAlumnos = new Alumnos[capacidad]; // Inicializa el array con la capacidad dada
        contador = 0; // Inicializa el contador a cero
    }

    //Método para agregar un nuevo alumno a la lista
    public void alta(Alumnos alumno) {
        if (contador < capacidad) { //Verifica si hay espacio disponible en la lista
            //Busca la primera posición libre en el array
            for (int i = 0; i < capacidad; i++) {
                if (listaAlumnos[i] == null) { //Si encuentra una posición libre
                    listaAlumnos[i] = alumno; //Agrega el alumno en esa posición
                    contador++; //Incrementa el contador de alumnos
                    System.out.println("Alumno agregado correctamente.");
                    return; 
                }
            }
        } else {
            System.out.println("No hay espacio para más alumnos."); 
        }
    }

    //Método para eliminar un alumno de la lista por su nombre
    public void baja(String nombre) {
        for (int i = 0; i < capacidad; i++) { //Recorre la lista de alumnos
            //Verifica si la posición no está vacía y si el nombre coincide con el buscado
            if (listaAlumnos[i] != null && listaAlumnos[i].getNombre().equals(nombre)) {
                listaAlumnos[i] = null; //Borra el alumno y almacena null 
                contador--; //Decrementa el contador de alumnos
                System.out.println("Alumno eliminado correctamente.");
                return; 
            }
        }
        System.out.println("No se encontró ningún alumno con ese nombre."); 
    }

    //Método para listar todos los alumnos almacenados en la lista
    public void listar() {
        System.out.println("Listado de alumnos:");
        for (int i = 0; i < capacidad; i++) { //Recorre la lista de alumnos
            if (listaAlumnos[i] != null) { //Verifica si la posición no está vacía
                System.out.println(listaAlumnos[i]); //Imprime la información del alumno
            }
        }
    }
}
