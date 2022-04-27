package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

/**
 * Clase que genera y hace funcionar los botones de eleccion de colores del juego.
 * @author -Mariano Oconitrillo Vega & Brandon Rodriguez Vega
 *
 */
public class ColorButtons extends JButton{
  
  private int Contador=0;
  private Color currentColor=Color.GREEN;
  
  /**
   * Constructor que establece todos los tamaños y posiciones de los botones.
   */
  public ColorButtons() {

      this.setOpaque(false);
      this.setContentAreaFilled(false);
      this.setBorderPainted(false);
      this.setSize(40, 40);
      this.setPreferredSize(new Dimension(40,40));
      this.setMinimumSize(new Dimension(40, 40));
      this.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        Contador += 1;
        setColor();
      }
    });
  }
  
 
  public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(currentColor);
      g.fillOval(5, 4, 25, 25);
  }

  
  /**
   * Clase que establece el color de los botones cada vez que se clickean.
   */
  public void setColor() {
  if (this.Contador == 0) {
     this.setBackground(Color.GREEN);
     this.currentColor = Color.GREEN;
    }
    
  else if (this.Contador == 1) {
      this.setBackground(Color.YELLOW);
      this.currentColor = Color.YELLOW;
    }
    else if (this.Contador == 2) {
      this.setBackground(Color.CYAN);
      this.currentColor = Color.CYAN;
    }
    else if (this.Contador == 3) {
      this.setBackground(Color.ORANGE);
      this.currentColor = Color.ORANGE;
    }
    else if (this.Contador == 4) {
      this.setBackground(Color.MAGENTA);
      this.currentColor = Color.MAGENTA;
      this.Contador = -1;
    }
      
  }
  
  /**
   * Metodo que retorna el color actual del boton.
   * @return -Retorna el color actual del boton.
   */
  public Color getColor() {
    return this.currentColor;
  }
}