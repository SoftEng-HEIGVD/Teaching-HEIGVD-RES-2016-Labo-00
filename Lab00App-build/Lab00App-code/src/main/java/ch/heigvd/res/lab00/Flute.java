package ch.heigvd.res.lab00;

/**
 *
 * @author Daniel Palumbo
 */
public class Flute implements IInstrument {
   String sound;
   int fluteVolume;
   String color;
   
   public Flute(){
      fluteVolume = 3;
   }
   
   public String play(){
      return sound;
   }
   
   public int getSoundVolume(){
      return fluteVolume;
   }
   
   public String getColor(){
      return color;
   }
}
