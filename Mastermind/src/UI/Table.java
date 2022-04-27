package UI;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import logic.RandomCombination;

/**
 * Clase que genera el tablero del juego con cada linea de intetos y sus pistas.
 * @author Mariano Oconitrillo Vega & Brandon Rodirguez Vega
 *
 */
public class Table extends JPanel {
  
  private Panels line1;
  private Panels line2;
  private Panels line3;
  private Panels line4;
  private Panels line5;
  private Panels line6;
  private Panels line7;
  private Panels line8;
  private Panels line9;
  private Panels line10;
  private int redClues;
  
  ArrayList<Color> userCombination = new ArrayList<>();
  ArrayList<Panels> tablePanels = new ArrayList<>();
  RandomCombination randomCombination;

/**
 * Constructor del tablero.
 */
  public Table() {
    this.setBackground(Color.GREEN);
    this.setPreferredSize(new Dimension(370,680));
    this.setMaximumSize(new Dimension(370,680));
    this.randomCombination = new RandomCombination();
    
    JPanel mySecondPrincipal = new JPanel();
    mySecondPrincipal.setPreferredSize(new Dimension(320,550));
    mySecondPrincipal.setMaximumSize(new Dimension(320,550));
    mySecondPrincipal.setLayout(new GridLayout(10,1));
    this.add(mySecondPrincipal);
    
    this.line1 = new Panels();
    this.line1.setBackground(Color.LIGHT_GRAY);
    this.line2 = new Panels();
    this.line2.setBackground(Color.LIGHT_GRAY);
    this.line3 = new Panels();
    this.line3.setBackground(Color.LIGHT_GRAY);
    this.line4 = new Panels();
    this.line4.setBackground(Color.LIGHT_GRAY);
    this.line5 = new Panels();
    this.line5.setBackground(Color.LIGHT_GRAY);
    this.line6 = new Panels();
    this.line6.setBackground(Color.LIGHT_GRAY);
    this.line7 = new Panels();
    this.line7.setBackground(Color.LIGHT_GRAY);
    this.line8 = new Panels();
    this.line8.setBackground(Color.LIGHT_GRAY);
    this.line9 = new Panels();
    this.line9.setBackground(Color.LIGHT_GRAY);
    this.line10 = new Panels();
    this.line10.setBackground(Color.LIGHT_GRAY);
    
    mySecondPrincipal.add(line10);
    mySecondPrincipal.add(line9);
    mySecondPrincipal.add(line8);
    mySecondPrincipal.add(line7);
    mySecondPrincipal.add(line6);
    mySecondPrincipal.add(line5);
    mySecondPrincipal.add(line4);
    mySecondPrincipal.add(line3);
    mySecondPrincipal.add(line2);
    mySecondPrincipal.add(line1);
    
    tablePanels.add(line1);
    tablePanels.add(line2);
    tablePanels.add(line3);
    tablePanels.add(line4);
    tablePanels.add(line5);
    tablePanels.add(line6);
    tablePanels.add(line7);
    tablePanels.add(line8);
    tablePanels.add(line9);
    tablePanels.add(line10);
}
  
  /**
   * Metodo que cambia el color de los paneles del tablero basandose en los colores que ingreso el usuario mediante los botones. 
   * @param pTurn -Turno en el que esta e usuario
   * @param pColor1 -Color del boton 1
   * @param pColor2 -Color del boton 2 
   * @param pColor3 -Color del boton 3
   * @param pColor4 -Color del boton 4
   */
  public void ChangeColorsPanel(int pTurn, Color pColor1, Color pColor2, Color pColor3, Color pColor4) {
    
    for(int i=0; i < tablePanels.size(); i++) {
      if(i == pTurn) {
        
        this.tablePanels.get(i).setColor1(pColor1);
        this.tablePanels.get(i).setColor2(pColor2);
        this.tablePanels.get(i).setColor3(pColor3);
        this.tablePanels.get(i).setColor4(pColor4);
        
      }
    }
  }
  
  /**
   * Metodo que cambia el color de las pistas en el tablero basados en los colores elegidos por el ususario y la combinacion random.
   * @param pTurn -Turno en el que esta el usuario
   * @param pColor1 -Color del boton 1
   * @param pColor2 -Color del boton 2
   * @param pColor3 -Color del boton 3
   * @param pColor4 -Color del boton 4
   */
  public void ChangeClueColor(int pTurn, Color pColor1, Color pColor2, Color pColor3, Color pColor4) {
    
    Random random_method = new Random();
    
    userCombination.add(pColor1);
    userCombination.add(pColor2);
    userCombination.add(pColor3);
    userCombination.add(pColor4);
   
    for(int i=0; i < tablePanels.size(); i++) {
      if(i == pTurn) {
        this.tablePanels.get(i).getClue().setClues(this.userCombination, this.randomCombination.getCombination());
        
          this.redClues=this.tablePanels.get(i).getClue().getRedClues();
          int RedClues = this.tablePanels.get(i).getClue().getRedClues();
          int WhiteClues = this.tablePanels.get(i).getClue().getWhiteClues();
          ArrayList<Integer> repeated = new ArrayList<>();
          
          for(int x = 0; x < 4; x++) {
            int index = random_method.nextInt(4);
            
            if(RedClues > 0) {
              
              if (repeated.contains(index)) {
                x-=1;
                continue;
              }
              else {

            	this.tablePanels.get(i).getClue().getClueslist().get(index).setBackground(Color.red);
                repeated.add(index);
                RedClues-=1;
              }

            }
            else {
              if (repeated.contains(index)) {
                x-=1;
                continue;
              }
              
              else if (WhiteClues>0){
                this.tablePanels.get(i).getClue().getClueslist().get(index).setBackground(Color.white);
                repeated.add(index);
                WhiteClues-=1;
              }
            }
          }
          userCombination.clear();
        }
      }
    }

  /**
   * Metodo donde se obtiene la cantidad de pistas rojas
   * @return -La cantidad de pistas rojas.
   */
      public int getRed() {
        return this.redClues;
      }
}