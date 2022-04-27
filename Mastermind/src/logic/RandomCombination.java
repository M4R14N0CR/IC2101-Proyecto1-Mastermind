package logic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *  Esta clase se encarga de realizar una combinacion de 4
 * colores aleatorios.
 * @author Mariano Oconitrillo y Brandon Rodríguez Vega.
 *
 */
public class RandomCombination {

  private ArrayList<Color> colorslist = new ArrayList<>();
  private ArrayList<Color> colorscombiantion = new ArrayList<>();
  
  /**
   * Constructor de las combinaciones random.
   */
  public RandomCombination() {
    
    Random random_method = new Random();
    
    colorslist.add(Color.GREEN);
    colorslist.add(Color.YELLOW);
    colorslist.add(Color.CYAN);
    colorslist.add(Color.ORANGE);
    colorslist.add(Color.MAGENTA);
    
    for(int i=0; i < colorslist.size();i++) {
      int index = random_method.nextInt(colorslist.size());
      colorscombiantion.add(colorslist.get(index));
      
    }
    colorscombiantion.remove(4);
    for(int i=0; i < colorscombiantion.size();i++) {
      System.out.println(colorscombiantion.get(i));

      
    }
  }
  /**
   * Metodo que retorna la lista con la combinacion random de colores.
   * @return -Una lista de colores con la combinacion random.
   */
  public ArrayList<Color> getCombination() {
    return colorscombiantion;
  }
}
