public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String grado;

    // Constructor
    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    // Método para estudiar
    public void estudiar() {
        System.out.println(nombre + " está estudiando en el grado " + grado + ".");
    }


}
