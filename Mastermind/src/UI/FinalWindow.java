package UI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/** 
 * Esta clase crea la ventana que se despliega cuando el
 * juego finaliza.
 * @author Mariano Oconitrillo y Brandon Rodríguez Vega.
 *
 */
public class FinalWindow extends JFrame{
  
  private JButton yesButton; 
  private JButton noButton; 
  private JButton cancelButton; 

  /**
   *  Contructor donde se colocan todos
   * los funcionamientos que va a tener.
   * @param Victory es un String que de un mensaje que
   * depende de si el jugador ganó o perdió.
   */
  public FinalWindow(String pVictoryMessage) {
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setTitle("Select an Option");
    this.setBounds(20, 300, 340, 130);
    this.setResizable(false);
    this.setVisible(true);
    
    JLabel myLabel = new JLabel(pVictoryMessage);
    myLabel.setFont(new Font("Arial", Font.BOLD, 12));
    
    this.yesButton = new JButton("Yes");
    this.yesButton.addActionListener(new ActionListener() {
      
      @Override
      /**
       *  Este metodo le da la accion al boton de "Yes"
       * Si se oprime el boton el juego iniciara de nuevo
       * @param e
       */
      public void actionPerformed(ActionEvent e) {
        Principal.main(null);
        yesButton.setEnabled(false);
        noButton.setEnabled(false);
        cancelButton.setEnabled(false);
      }
    })
    ;
    
    this.noButton = new JButton("No");
    this.noButton.addActionListener(new ActionListener() {
      
      @Override
      /** 
       * Este metodo le da la accion al boton de "No"
       * Si se oprime el boton el programa finaliza
       * @param e
       */
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
        
      }
    })
    ;

    this.cancelButton = new JButton("Cancel");
    this.cancelButton.addActionListener(new ActionListener() {
      
      @Override
      /**
       * Este metodo le da la accion al boton de "Cancel"
       * Si se oprime el boton el programa finaliza
       * @param e
       */
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
        
      }
    })
    ;
    
    JPanel myPanel = new JPanel();
    myPanel.setLayout(new FlowLayout());
    myPanel.add(myLabel);
    myPanel.add(yesButton);
    myPanel.add(noButton);
    myPanel.add(cancelButton);
    this.add(myPanel);
  }

}
