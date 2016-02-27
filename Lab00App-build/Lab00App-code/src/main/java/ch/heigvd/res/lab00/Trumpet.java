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
public class Trumpet implements IInstrument {
   public Trumpet(){
   }
   
   public String play(){
      return "pouet";
   }
   
   public String getColor(){
      return "golden";
   }
   
   public int getSoundVolume(){
      return 10;
      
   }
}
