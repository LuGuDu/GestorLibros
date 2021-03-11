package dominio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingQueue;

public class funciones {
	
	static Scanner TECLADO = new Scanner (System.in);
	
	public static void leerFichero(String titulo, String autor, String editorial, Queue<libro> cola, File f)
			throws IOException {

		String strCurrentLine;
		BufferedReader br = new BufferedReader(new FileReader(f));
		while ((strCurrentLine = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(strCurrentLine);
			titulo = st.nextToken(";");
			autor = st.nextToken(";");
			editorial = st.nextToken();
			libro libro_nuevo = new libro(titulo, autor, editorial);
			cola.add(libro_nuevo);
		}
		br.close();
	}
	
	public static void crearLibro(String titulo, String autor, String editorial, Queue<libro> cola) {
		//TECLADO.nextLine();
		System.out.println("Introduzca el título del libro: ");
		titulo = TECLADO.nextLine();
		System.out.println("Introduzca el autor del libro: ");
		autor = TECLADO.nextLine();
		System.out.println("Introduzca la editorial del libro: ");
		editorial = TECLADO.nextLine();
		libro libro_nuevo = new libro(titulo, autor, editorial);
		cola.add(libro_nuevo);
	}
	
	public static void eliminarLibro(Queue<libro> cola) {
		if (cola.isEmpty()) {
			System.out.println("La lista esta vacía, pruebe a añadir un libro.\n");
		} else {
			libro a = cola.poll();
			System.out.println("Has eliminado con exito el siguiente libro: ");
			System.out.println(a.toString());
		}
	}

	public static void mostrarLista(Queue<libro> cola) {
		Queue<libro> reserva = new LinkedBlockingQueue<libro>();
		if (cola.isEmpty()) {
			System.out.println("La lista esta vacía, pruebe a añadir un libro.\n");
		} else {
			do {
				reserva.add(cola.remove());
			} while (!cola.isEmpty());
			int contador = 1;
			do {
				libro libro_mostrar = reserva.remove();
				cola.add(libro_mostrar);
				System.out.println(contador + "º- " + libro_mostrar.toString());
				contador++;
			} while (!reserva.isEmpty());
		}
	}

	public static void guardarLista(Queue<libro> cola, File f) throws InterruptedException, IOException {
		FileWriter fw = new FileWriter(f);
		do {
			libro libro_mostrar = cola.remove();
			fw.write(libro_mostrar.get_titulo() + ";" + libro_mostrar.get_autor() + ";" + libro_mostrar.get_editorial()
					+ "\n");
		} while (!cola.isEmpty());
		fw.close();

		System.out.print("Guardando lista");
		Thread.sleep(1 * 500);
		System.out.print(" .");
		Thread.sleep(1 * 500);
		System.out.print(".");
		Thread.sleep(1 * 500);
		System.out.println(".");
		System.out.print("Guardado");
	}
}
