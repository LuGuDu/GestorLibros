package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class principal {

	private JFrame frmGestorDeLibros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
					window.frmGestorDeLibros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestorDeLibros = new JFrame();
		frmGestorDeLibros.setTitle("SmartLibrary");
		frmGestorDeLibros.setBounds(100, 100, 450, 300);
		frmGestorDeLibros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
