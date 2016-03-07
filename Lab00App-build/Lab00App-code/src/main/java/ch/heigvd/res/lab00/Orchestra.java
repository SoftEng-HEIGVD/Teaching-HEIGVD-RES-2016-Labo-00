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
 * @author romai
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
