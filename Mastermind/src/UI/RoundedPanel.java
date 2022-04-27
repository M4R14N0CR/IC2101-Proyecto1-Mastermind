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
    private int xAxis;
    private int yAxis;
    private int width;
    private int hight;

/**
 * Este es el constructor de la clase.
 * @param pXAxis -Es la ubicación del ovalo en el eje x.
 * @param pYAxis -Es la ubicación del ovalo en el eje y.
 * @param pWidth -Es la anchura del ovalo.
 * @param pHight  -Es la altura del ovalo.
 */
    public RoundedPanel(int pXAxis,int pYAxis,int pWidth,int pHight) {
      this.xAxis=pXAxis;
      this.yAxis=pYAxis;
      this.width=pWidth;
      this.hight=pHight;
    }
    
    /**
     * Este metodo genera el dibujo del ovalo y le coloca el color correspondiente.
     */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.gray);
        g.fillOval(this.xAxis,this.yAxis,this.width,this.hight); 
        g.setColor(getBackground());
        g.fillOval(this.xAxis,this.yAxis,this.width,this.hight); 
       
    }

}
