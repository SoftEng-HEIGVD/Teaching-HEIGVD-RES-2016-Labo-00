package ch.heigvd.res.lab00;

/**
 *
 * @author Antoine
 */
public class Flute implements IInstrument {
   private int decibel;
   private String sound;
   private String color;
   
   public Flute() {
      decibel = 60;
      sound   = "les sanglots longs des violons de l'automne";
      color   = "blanc";
   }
   
   @Override
   public String getColor(){
      return color;
   }
   
   @Override
   public int getSoundVolume() {
      return decibel;
   }
   
   @Override
   public String play() {
      return sound;
   }
}
