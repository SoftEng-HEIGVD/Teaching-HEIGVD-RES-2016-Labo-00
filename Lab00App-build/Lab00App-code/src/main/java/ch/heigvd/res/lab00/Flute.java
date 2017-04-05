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
public class Flute implements IInstrument{

   public int getSoundVolume(){
      return 2;
   }
   
   public String getColor(){
      return "black";
   }
   
   public String play(){
      return "pouet";
   }
}
