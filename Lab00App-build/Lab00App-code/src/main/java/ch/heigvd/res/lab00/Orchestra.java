/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucie
 */
public class Orchestra {
   private ArrayList<IInstrument> instruments;
   
   public Orchestra(){
      instruments = new ArrayList<IInstrument>();
   }
   
   public int getNumberOfInstruments(){
      return instruments.size();
   }
  
   public void addInstrument(IInstrument i){
      instruments.add(i);
   }
   
   public List<String> makeMusic(){
      List<String> sounds = new ArrayList<String>();
      for(IInstrument i : instruments){
         sounds.add(i.play());
      }
      return sounds;
   }
}
