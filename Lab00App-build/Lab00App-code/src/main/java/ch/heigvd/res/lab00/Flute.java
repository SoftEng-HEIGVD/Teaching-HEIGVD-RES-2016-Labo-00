/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author TCHUENSU Rodrigue
 */
public class Flute implements IInstrument{
   public Flute(){}
   
   public int getSoundVolume(){
      return new Trumpet().getSoundVolume() - 1;
   }
   public String play(){
      return "DoReMiFaSol";
   }
   
   public String getColor(){
      return "varied";   
   }
}