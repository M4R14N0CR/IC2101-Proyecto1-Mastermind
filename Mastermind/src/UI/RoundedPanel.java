package UI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *  Esta clase tiene la funcion de crear los dibujos ciculares del tablero.
* @author Mariano Oconitrillo y Brandon Rodríguez Vega.
*
*/
class RoundedPanel extends JPanel
{
    private int horizontalAxis;
    private int verticalyAxis;
    private int width;
    private int hight;

/**
 * Este es el constructor de la clase.
 * @param pVerticalAxis -Es la ubicación del ovalo en el eje x.
 * @param pVerticalAxis -Es la ubicación del ovalo en el eje y.
 * @param pWidth -Es la anchura del ovalo.
 * @param pHight -Es la altura del ovalo.
 */
    public RoundedPanel(int pHorizontalAxis,int pVerticalAxis,int pWidth,int pHight) {
      this.horizontalAxis=pVerticalAxis;
      this.verticalyAxis=pVerticalAxis;
      this.width=pWidth;
      this.hight=pHight;
    }
    
    /**
     * Este metodo genera el dibujo del ovalo y le coloca el color correspondiente.
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.fillOval(this.horizontalAxis,this.verticalyAxis,this.width,this.hight); 
        g.setColor(getBackground());
        g.fillOval(this.horizontalAxis,this.verticalyAxis,this.width,this.hight); 
       
    }

}
