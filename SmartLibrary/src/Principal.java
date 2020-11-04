import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Principal {

	// COSAS PARA IMPLEMENTAR:
	// Sistema de login y password
	// Crear por usuario un directorio con dos ficheros: libros actuales y libros leidos

	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {

		File libros_actuales = new File("libros_actuales.txt");
		libros_actuales.createNewFile();

		String titulo = null, autor = null, editorial = null;
		int eleccion = 0;
		boolean seguir = true;

		Queue<libro> cola = new LinkedBlockingQueue<libro>();
		funciones.leerFichero(titulo, autor, editorial, cola, libros_actuales);
		frases frase1 = new frases();
		
		do {
			System.out.println("\n////GESTOR DE LIBROS\\\\ " + "\n\n"+frase1.getFrase()+"\n\n" + "Menu de opciones:\n"
					+ "\n1. Añadir libro a la lista\n2. Quiero eliminar el libro actual"
					+ "\n3. Quiero ver toda la lista\n4. Guardar lista");

			do {
				System.out.println("\nIntroduzca una opcion del menu: ");
				eleccion = TECLADO.nextInt();
			} while ((eleccion < 1) || (eleccion > 4));

			switch (eleccion) {
			case 1:
				funciones.crearLibro(titulo, autor, editorial, cola);
				break;
			case 2:
				funciones.eliminarLibro(cola);
				break;
			case 3:
				funciones.mostrarLista(cola);
				break;
			case 4:
				funciones.guardarLista(cola, libros_actuales);
				funciones.leerFichero(titulo, autor, editorial, cola, libros_actuales);
				break;
			}
		} while (seguir);
	}	
}
