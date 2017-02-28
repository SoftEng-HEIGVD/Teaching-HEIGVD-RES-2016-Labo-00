
package ch.heigvd.res.lab00;

public class Flute implements IInstrument{
   public Flute(){}
   
   public int getSoundVolume(){
      return new Trumpet().getSoundVolume() - 1;
   }
   public String play(){
      return "trilili";
   }
   
   public String getColor(){
      return "varied";   
   }
}