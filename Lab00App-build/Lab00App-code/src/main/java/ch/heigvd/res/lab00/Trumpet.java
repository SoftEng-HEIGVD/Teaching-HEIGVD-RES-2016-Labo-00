package ch.heigvd.res.lab00;

/**
 *
 * @author Antoine
 */
public class Trumpet implements IInstrument {
   
   private int decibel;
   private String sound;
   private String color;
   
   public Trumpet() {
      decibel = 80;
      sound   = "pouet";
      color   = "golden";
   }
   public String getColor(){
      return color;
   }
   
   public int getSoundVolume() {
      return decibel;
   }
   
   public String play() {
      return sound;
   }
}
