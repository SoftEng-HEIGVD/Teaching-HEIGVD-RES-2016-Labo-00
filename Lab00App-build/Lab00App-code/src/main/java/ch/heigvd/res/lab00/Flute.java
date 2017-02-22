package ch.heigvd.res.lab00;

/**
 *
 * @author Luca
 */
public class Flute implements IInstrument {
   private String sound = "pouet";
   private int soundVolume = 10;
   private String color = "golden";
   
   public String play() {
      return sound;
   }
   
   public int getSoundVolume() {
      return soundVolume;
   }
   
   public String getColor() {
      return color;
   }
}
