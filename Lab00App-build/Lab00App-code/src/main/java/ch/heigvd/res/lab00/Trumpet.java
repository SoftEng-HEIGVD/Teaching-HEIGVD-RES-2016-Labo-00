package ch.heigvd.res.lab00;

/**
 * Class representing a Trumpet
 *
 * @author Romain Albasini
 */
public class Trumpet implements IInstrument {
   public Trumpet(){
   }
   
   public String play(){
      return "pouet";
   }
   
   public String getColor(){
      return "golden";
   }
   
   public int getSoundVolume(){
      return 10;
      
   }
}
