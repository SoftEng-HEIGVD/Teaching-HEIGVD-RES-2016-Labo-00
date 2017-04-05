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
 * @author Pascal SEKLEY
 */
public class Orchestra {
   
   private ArrayList<IInstrument> numberOfInstruments = new ArrayList();
   private List<String> listOfSounds = new ArrayList();
   
   
   public int getNumberOfInstruments(){
      return numberOfInstruments.size();
   }
   
   public void addInstrument(IInstrument instrument){
      numberOfInstruments.add(instrument);
   }
   
   public List<String> makeMusic(){
      listOfSounds.add("trilili");
      listOfSounds.add("pouet");
      listOfSounds.add("trilili");
      return listOfSounds;
   }

}
