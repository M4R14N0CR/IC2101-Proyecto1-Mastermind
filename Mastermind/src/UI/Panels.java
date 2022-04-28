package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

/** 
 * Esta clase se encarga de crear 4 paneles, los cuales se 
 * ubican en cada una de las 10 filas, estos son los que se
 * van a ir colorando cada que oprimimos enviar.
 * @author Mariano Oconitrillo y Brandon Rodríguez Vega.
 *
 */
public class Panels extends JPanel{
  
  private RoundedPanel Panel1;
  private RoundedPanel Panel2;
  private RoundedPanel Panel3;
  private RoundedPanel Panel4;
  private Clues myClue;
  
  /** 
   * Constructor donde se crea cada panel con sus respectivos atributos.
   */
  public Panels() {
    this.setLayout(new FlowLayout());
    
    this.Panel1 = new RoundedPanel(0,0,35,35);
    this.Panel1.setPreferredSize(new Dimension(45,45));
    this.Panel1.setMaximumSize(new Dimension(45,45));
    this.Panel1.setOpaque(false);
    this.Panel1.setBackground(Color.GRAY);
    
    this.Panel2 = new RoundedPanel(0,0,35,35);
    this.Panel2.setPreferredSize(new Dimension(45,45));
    this.Panel2.setMaximumSize(new Dimension(45,45));
    this.Panel2.setOpaque(false);
    this.Panel2.setBackground(Color.GRAY);
    
    this.Panel3 = new RoundedPanel(0,0,35,35);
    this.Panel3.setPreferredSize(new Dimension(45,45));
    this.Panel3.setMaximumSize(new Dimension(45,45));
    this.Panel3.setOpaque(false);
    this.Panel3.setBackground(Color.GRAY);
    
    this.Panel4 = new RoundedPanel(0,0,35,35);
    this.Panel4.setPreferredSize(new Dimension(45,45));
    this.Panel4.setMaximumSize(new Dimension(45,45));
    this.Panel4.setOpaque(false);
    this.Panel4.setBackground(Color.GRAY);
    
    this.myClue = new Clues();
    
    this.add(Panel1);
    this.add(Panel2);
    this.add(Panel3);
    this.add(Panel4);
    this.add(myClue);
  }
  
    /** 
     * Metodo que se encarga de colocar el
     * color correspondiente en el primer panel
     * @param color es el color que se le colocará al panel
     */
    public void setColor1(Color color) {
      this.Panel1.setBackground(color);
    }
    
    /** 
     * Metodo que se encarga de colocar el
     * color correspondiente en el segundo panel
     * @param color es el color que se le colocará al panel
     */
    public void setColor2(Color color) {
      this.Panel2.setBackground(color);
    }
    
    /**
     *  Metodo que se encarga de colocar el
     * color correspondiente en el tercer panel
     * @param color es el color que se le colocará al panel
     */
    public void setColor3(Color color) {
      this.Panel3.setBackground(color);
    }
    
    /** 
     * Metodo que se encarga de colocar el
     * color correspondiente en el cuarto panel
     * @param color es el color que se le colocará al panel
     */
    public void setColor4(Color color) {
      this.Panel4.setBackground(color);
    }

    /**
     * Metodo que retorna las pistas
     * @return - retorna myClue
     */
    public Clues getClue() {
        return this.myClue;
      }
}
