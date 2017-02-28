package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

   public Trumpet() {

   }

   @Override
   public String getColor() {
      return "golden";
   }

   @Override
   public String play() {
      return "pouet";
   }

   @Override
   public int getSoundVolume() {
      return 4;
   }

}
