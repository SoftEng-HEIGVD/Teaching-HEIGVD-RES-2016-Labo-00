package ch.heigvd.res.lab00;

/**
 * Created by gothg on 23.02.2017.
 */
public class Trumpet implements IInstrument {
   public String play() {
      return "pouet";
   }
   public int getSoundVolume() {
      return 20;
   }

   public String getColor() {
      return "golden";
   }
}
