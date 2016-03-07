/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author romai
 */
public class Flute implements IInstrument {
   public Flute(){
      
   }
   
   public String getColor(){
      return "brown";
   }
   
   public String play(){
      return "trilili";
   }
   public int getSoundVolume(){
      return 3;
   }
}
