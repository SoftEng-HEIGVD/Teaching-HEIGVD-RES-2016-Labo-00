package ch.heigvd.res.lab00;

public class BongoDrum implements IInstrument {
   private String sound;
   private int volume;
   private String color;
   
   public BongoDrum() {
      this.sound = "bongo bongo";
      this.volume = 3;
      this.color = "red";
   }
   
   @Override
   public String play() {
      return sound;
   }

   @Override
   public int getSoundVolume() {
      return volume;
   }

   @Override
   public String getColor() {
      return color;
   }
   
}