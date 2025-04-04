public class Main {
    public static void main(String[] args) {
        // Prueba de la clase Libro
        Libro miLibro = new Libro("Cien años de soledad", "Gabriel García Márquez", 471);
        miLibro.leerPagina();

        // Prueba de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Carlos", 16, "10°");
        estudiante1.estudiar();

        // Prueba de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "Juan Pérez", 500.0);
        cuenta1.depositar(200.0);
        cuenta1.retirar(400.0);
        cuenta1.retirar(700.0); // Intento de retiro con saldo insuficiente

        // Prueba de la clase Empleado
        Empleado empleado1 = new Empleado("Ana López", "Desarrolladora de Software", 3500.0);
        empleado1.trabajar();
    }
}
