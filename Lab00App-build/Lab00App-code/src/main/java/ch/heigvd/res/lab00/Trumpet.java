package ch.heigvd.res.lab00;

class Trumpet implements IInstrument {
   public String play() {
      return "pouet";
   }

   public int getSoundVolume() {
      return 9001; // =)
   }

   public String getColor() {
      return "golden";
   }
}