/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Daniel
 */
public class Trumpet implements IInstrument {
   String sound;
   int trumpetVolume;
   String color;
   
   public Trumpet(){
      sound = "pouet";
      trumpetVolume = 6;
      color = "golden";
   }
   
   public String play(){
      return sound;
   }
   
   public int getSoundVolume(){
      return trumpetVolume;
   }
   
   public String getColor(){
      return color;
   }
}
