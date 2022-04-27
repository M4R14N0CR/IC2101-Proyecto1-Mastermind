package UI;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Clase grid que une el Table con el Keyboard y los muestra en pantalla. 
 * @author Mariano Oconitrillo Vega & Brandon Rodriguez Vega
 *
 */
public class Grid extends JPanel{
  
  private Table table;
  private keyboard appKeyboard;
  
  /**
   * Genera el grid con su respectivo keyboard y table.
   */
  public Grid() {
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    
    this.appKeyboard = new keyboard(this);
    this.table = new Table();
    
    this.add(this.table);
    this.add(this.appKeyboard);
    
  
  }
  /**
   * Metodo que recibe el turno en el que esta el jugador y cambia el color en el tablero.
   * @param pTurn -El turno en el que esta el usuario.
   */
  public void ChangeColor(int pTurn) {
    
    	Color color1 = this.appKeyboard.getButton1().getColor();
    	Color color2 = this.appKeyboard.getButton2().getColor();
    	Color color3 = this.appKeyboard.getButton3().getColor();
    	Color color4 = this.appKeyboard.getButton4().getColor();
    	
    	table.ChangeClueColor(pTurn, color1, color2, color3, color4);
    	table.ChangeColorsPanel(pTurn, color1, color2, color3, color4);
    	
    	if (this.table.getRed() == 4) {
            FinalWindow myWindow = new FinalWindow("Felicidades, ha ganado!!!. Desea jugar de nuevo?");
            myWindow.setVisible(true);
            this.appKeyboard.getSendButton().setEnabled(false);
        
          }
    	else if(pTurn==9 && table.getRed()!=4) {
    	        FinalWindow myWindow = new FinalWindow("Sus turnos se han terminado. Desea jugar de nuevo?");
    	        myWindow.setVisible(true);

    	      }
    	
    }

}