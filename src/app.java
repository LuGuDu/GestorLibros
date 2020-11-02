import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class app {

	// COSAS PARA IMPLEMENTAR:
	// Sistema de login y password
	// Crear por usuario un directorio con dos ficheros: libros actuales y libros leidos

	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//ventana v1 = new ventana();
		//v1.setVisible(true);

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
	
	public void ventana() {
		
		JPanel contentPane;
		JTextField textCliente;
		JTextField textFieldPass;
		JTextPane textPaneEstado;
		
		frases frase1 = new frases();
		
		this.setSize(800,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Gestor de libros");
		//this.setLocation(450,50);
		//this.setBounds(450,50,500,500);
		this.setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduzcaElLogin = new JLabel(frase1.getFrase());
		lblIntroduzcaElLogin.setBounds(6, 19, 800, 43);
		contentPane.add(lblIntroduzcaElLogin);
		
		JButton buttonAñadir = new JButton("Añadir libro a la lista");
		buttonAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		

			}
		});
		buttonAñadir.setBounds(200, 69, 148, 29);
		contentPane.add(buttonAñadir);
		
		JButton buttonQuitar = new JButton("He acabado el ultimo libro");
		buttonQuitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		

			}
		});
		buttonQuitar.setBounds(400, 69, 148, 29);
		contentPane.add(buttonQuitar);
		
		JButton buttonVer = new JButton("Ver toda la lista");
		buttonVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				textPaneEstado = funciones.mostrarLista(cola);

			}
		});
		buttonVer.setBounds(200, 140, 148, 29);
		contentPane.add(buttonVer);
		
		JButton buttonGuardar = new JButton("Guardar lista");
		buttonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		

			}
		});
		buttonGuardar.setBounds(400, 140, 148, 29);
		contentPane.add(buttonGuardar);
		
		/*
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setForeground(Color.RED);
		lblEstado.setBounds(6, 208, 61, 16);
		contentPane.add(lblEstado);
		*/
		textPaneEstado = new JTextPane();
		textPaneEstado.setToolTipText("Panel para mostrar el restultado de la comprobaci\u00F3n de login o las excepciones lanzadas");
		textPaneEstado.setEditable(true);
		textPaneEstado.setBounds(6, 200, 770, 400);
		contentPane.add(textPaneEstado);
		
		JButton buttonLimpiar = new JButton("Limpiar");
		buttonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPaneEstado.setText("");
				/*Limpiaremos el panel de salida para visualizar nuevas operaciones
				 */
			}
		});
	}
}
