/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.heigvd.res.lab00;

/**
 * 
 * @author Pascal SEKLEY
 */

   
public class Trumpet implements IInstrument {

   public String getColor(){
      return "golden";
   }
   
   public int getSoundVolume(){
      return 5;
   }
   
   public String play(){
      return "pouet";
   }
}
