package GestionBiblioteca;

public class Main {
    public static void main(String[] args) {

        Libro librouno = new Libro("El Pricipito", "Antoine de Saint-Exupéry", 96, 1943);
        Libro librodos = new Libro ("Cien Años de Soledad", "Gabriel Garcia Marquez", 417, 1967);

        System.out.println("Datos de libro 1: ");
        librouno.mostrarDatosLibros();
        System.out.println("--------------------------------- ");

        System.out.println("Datos de libro 2: ");
        librodos.mostrarDatosLibros();
        System.out.println("--------------------------------- ");

        System.out.println("Nombre de libro 2: " + librodos.getTitulo());
        librodos.setTitulo("Amor en los tiempos del colera");
        System.out.println("Nombre del libro 2 modificado: " + librodos.getTitulo());
        System.out.println("--------------------------------- ");



    }
}