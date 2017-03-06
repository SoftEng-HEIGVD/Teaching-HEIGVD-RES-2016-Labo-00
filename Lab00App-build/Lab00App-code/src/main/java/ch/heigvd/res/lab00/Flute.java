package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
   private String color = "brown";
   private int soundVolume = 5;
  
  public Flute() {
	  
  }

   @Override
   public String play() {
      return " ";
   }

   @Override
   public int getSoundVolume() {
      return soundVolume;
   }

   @Override
   public String getColor() {
      return color;
   }
}
	