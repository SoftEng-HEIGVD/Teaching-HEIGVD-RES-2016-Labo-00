package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing an Orchestra
 *
 * @author Romain Albasini
 */
public class Orchestra{
   public Orchestra(){
      instrumentList = new ArrayList<>();
   }
   public void addInstrument(IInstrument i){
      instrumentList.add(i);
   }
   
   public int getNumberOfInstruments(){
      return instrumentList.size();
   }
   
   public List<String> makeMusic(){
      List<String> sounds = new ArrayList<String>();
      for(IInstrument i : instrumentList){
         sounds.add(i.play());
      }
      
      return sounds;
   }
   
   private List<IInstrument> instrumentList;
}
