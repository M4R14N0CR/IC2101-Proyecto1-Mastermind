package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Esta clase tiene todo lo necesario para que las pistas del juego funcionen.
 * @author -Mariano Oconitrillo & Brandon Rodriguez Vega
 *
 */
public class Clues extends JPanel{
  
	private RoundedPanel Clue1;
	private RoundedPanel Clue2;
	private RoundedPanel Clue3;
	private RoundedPanel Clue4;
	private int RedClues;
	private int WhiteClues;
	private ArrayList<JPanel> clues = new ArrayList<>();

  /**
   * Constructor que crea las pistas del juego con sus respectivos tamaños.
   */
  public Clues() {
	   this.setLayout(new GridLayout(2,2));
	    this.setPreferredSize(new Dimension(50,50));
	    this.setMaximumSize(new Dimension(50,50));
	    this.setBackground(Color.lightGray);
	    
	    this.RedClues = 0;
	    this.WhiteClues = 0;
	    
	    this.Clue1 = new RoundedPanel(0,0,24,24);
	    this.Clue1.setOpaque(false);
	    Clue1.setBackground(Color.gray);
	    clues.add(Clue1);
	    
	    this.Clue2 = new RoundedPanel(0,0,24,24);
	    this.Clue2.setOpaque(false);
	    Clue2.setBackground(Color.gray);
	    clues.add(Clue2);
	    
	    this.Clue3 = new RoundedPanel(0,0,24,24);
	    this.Clue3.setOpaque(false);
	    Clue3.setBackground(Color.gray);
	    clues.add(Clue3);
	    
	    this.Clue4 = new RoundedPanel(0,0,24,24);
	    this.Clue4.setOpaque(false);
	    Clue4.setBackground(Color.gray);
	    clues.add(Clue4);
	    
	    this.add(Clue1);
	    this.add(Clue2);
	    this.add(Clue3);
	    this.add(Clue4);
  }
  
    
   
    /**
     * Clase que utilizando la combinacion generada por la computadora y la combinacion seleccionada por el usuario,
     *  genera las pistas para el jugador.
     * @param -userCombination Combinacion elejida por el usuario
     * @param-randomCombination Combinacion random generada por la computadora.
     */
    public void setClues(ArrayList<Color> userCombination, ArrayList<Color> randomCombination) {
      ArrayList<Color> CopyRandom = new ArrayList<>();
      
      for (int i =0;i<4;i++) {
        CopyRandom.add(randomCombination.get(i));
      }
      
      for(int i = 0; i < 4;i++) {
        if(CopyRandom.get(i) == userCombination.get(i)) {
          this.RedClues ++;
          CopyRandom.set(i, Color.BLACK);
          userCombination.set(i, Color.PINK);
        }
      }
   

       for (int i = 0; i < 4; i++) {
          if (userCombination.get(i)!=Color.PINK) {
            for (int j = 0; j < 4; j++) {
              if (CopyRandom.get(j)!=Color.BLACK) {
                if (userCombination.get(i)== CopyRandom.get(j)) {
                  this.WhiteClues++;
                  userCombination.set(i, Color.PINK);
                  CopyRandom.set(j, Color.BLACK);
                }
               }
              } 
             }    
            }
       
    }
      
    
    /**
     * Metodo para obtener la cantidad de pistas rojas (color en el lugar correcto) del intento.
     * @return -La cantidad de pistas rojas del turno.
     */
    public int getRedClues() {
      return this.RedClues;
    }
    
    /**
     * Metodo para obtener la cantidad de pistas blancas (color existente en la combinacion pero en el lugar incorrecto) del intento.
     * @return -Retorna la cantidad de pistas blancas del turno.
     */
    public int getWhiteClues() {
      return this.WhiteClues;
    }
    
    /**
     * Metodo que retorna una lista con los 4 paneles de las pistas.
     * @return -Lista de paneles.
     */
    public ArrayList<JPanel> getClueslist() {
        return clues;
    }
    
}