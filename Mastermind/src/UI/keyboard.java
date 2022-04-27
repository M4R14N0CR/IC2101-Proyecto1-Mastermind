package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Clase que genera el panel con los botones selecionadores de colores y el botones de "Enviar".
 * @author Mariano Oconitrillo Vega & Brandon Rodriguez Vega
 *
 */
public class keyboard extends JPanel {
  private Grid grid;
  private ColorButtons Button_1;
  private ColorButtons Button_2;
  private ColorButtons Button_3;
  private ColorButtons Button_4;
  private JButton sendButton;
  private int turn = 0;
  
  /**
   * Constructor que genera el panel con todas sus medidas y componentes.
   * @param appGrid -El grid de la aplicacion
   */
  public keyboard(Grid appGrid) {
    this.grid = appGrid;
    this.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
    this.setSize(300, 90);
    this.setMaximumSize(new Dimension(370,90));
    this.setPreferredSize(new Dimension(370,90));
    this.setBackground(Color.LIGHT_GRAY);
    
    this.Button_1 = new ColorButtons();
    this.Button_2 = new ColorButtons();
    this.Button_3 = new ColorButtons();
    this.Button_4 = new ColorButtons();
    
    this.sendButton = new JButton("Enviar");
    sendButton.setPreferredSize(new Dimension(400,25));
    sendButton.setMaximumSize(new Dimension(400,25));
    sendButton.addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
        grid.ChangeColor(turn);
        turn ++;
        if(turn == 10) {
        	sendButton.setEnabled(false);
        }
       
        }
        
        
      
    });
    
    this.add(Button_1);
    this.add(Button_2);
    this.add(Button_3);
    this.add(Button_4);
    this.add(sendButton);
  
    
  }
  
  /**
   * Metodo que retorna el boton 1
   * @return - El color del boton 1
   */
  public ColorButtons getButton1() {
	  return this.Button_1;
  }
  
  /**
   * Metodo que retorna el boton 2
   * @return - El color del boton 2
   */
  public ColorButtons getButton2() {
	  return this.Button_2;
  }
  
  /**
   * Metodo que retorna el boton 3
   * @return - El color del boton 3
   */
  public ColorButtons getButton3() {
	  return this.Button_3;
  }
  
  /**
   * Metodo que retorna el boton 4
   * @return - El boton 4
   */
  public ColorButtons getButton4() {
	  return this.Button_4;
  }
  
  /**
   * Metodo que retorna el boton de enviar.
   * @return -Un JBotton.
   */
  public JButton getSendButton() {
	  return this.sendButton;
  }
}

