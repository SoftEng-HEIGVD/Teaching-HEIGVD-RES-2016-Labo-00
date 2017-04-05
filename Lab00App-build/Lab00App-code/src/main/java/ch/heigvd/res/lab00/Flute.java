package ch.heigvd.res.lab00;

/**
 * Class representing a Flute
 *
 * @author Romain Albasini
 */
public class Flute implements IInstrument {
   public Flute(){
      
   }
   
   public String getColor(){
      return "brown";
   }
   
   public String play(){
      return "trilili";
   }
   public int getSoundVolume(){
      return 3;
   }
}
