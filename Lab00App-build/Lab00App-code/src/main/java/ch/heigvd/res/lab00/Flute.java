
package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

   public Flute() {
   }

   @Override
   public String getColor() {
      return "silver";
   }

   @Override
   public String play() {
      return "trilili";
   }

   @Override
   public int getSoundVolume() {
      return 2;
   }
}
