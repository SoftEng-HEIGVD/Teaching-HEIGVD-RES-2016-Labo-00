/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Kevin Ponce
 */
public class Trumpet implements IInstrument
{
   public String getColor(){
       return "golden";
   }
    
   
   public String play(){
       return "pouet";
   }
   
   public int getSoundVolume(){
       return 2;
   }
    
}
