public class Empleado {
    // Atributos
    private String nombre;
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Método para simular que el empleado está trabajando
    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + puesto + ".");
    }


}
