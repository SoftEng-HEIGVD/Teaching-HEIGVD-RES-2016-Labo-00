
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {
   
   private LinkedList<IInstrument> instruments;
   
   private int numberOfInstrument;
   
   public Orchestra(){
      this.numberOfInstrument = 0;
      instruments = new LinkedList<>();
   };
   
   public int getNumberOfInstruments(){
      return numberOfInstrument;
   }
   
   public void addInstrument(IInstrument instrument){
         instruments.add(instrument);
         numberOfInstrument++;
   }
   
   public List<String> makeMusic(){
      LinkedList<String> sound = new LinkedList<>();
      for (IInstrument i : instruments){
         sound.add(i.play());
      }
      return sound;
   }  
}
