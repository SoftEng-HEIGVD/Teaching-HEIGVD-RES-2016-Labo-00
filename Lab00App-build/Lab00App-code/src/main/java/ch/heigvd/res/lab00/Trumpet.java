/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Anastasia Zharkova
 */
public class Trumpet implements IInstrument{

   int trumpetVolume = 10;
   String color = "golden";
   String son = "pouet";
   
   
   @Override
   public String play() {
      return son;
   }

   @Override
   public int getSoundVolume() {
      return trumpetVolume;
   }

   @Override
   public String getColor() {
      return color;
   }
   
   
}
