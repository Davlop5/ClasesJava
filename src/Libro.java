public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Método para leer una página
    public void leerPagina() {
        System.out.println("Estás leyendo una página del libro '" + titulo + "' de " + autor + ".");
    }

}
