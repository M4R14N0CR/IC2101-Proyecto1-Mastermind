package UI;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Clase principal que inicia la aplicación.
 * @author Mariano Oconitrillo Vega & Brandon Rodriguez Vega
 *
 */

public class Principal {
	
	/**
	 * Metodo main de la aplicacion.
	 * @param args 
	 */
	public static void main(String[] args) {
	JFrame appFrame = new JFrame();
	appFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	
	Grid appGrid = new Grid();
	appFrame.add(appGrid);
	
	appFrame.setSize(new Dimension(370,700));
	appFrame.setPreferredSize(new Dimension(370,690));
	appFrame.setMaximumSize(new Dimension(370,690));
	appFrame.setResizable(false);
	appFrame.pack();
	appFrame.setVisible(true);
	}
}
