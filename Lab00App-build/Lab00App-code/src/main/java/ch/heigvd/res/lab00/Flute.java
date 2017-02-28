/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Michela Zucca
 */
public class Flute implements IInstrument {

   public Flute() {
   }

   @Override
   public String getColor() {
      return "silver";
   }

   @Override
   public String play() {
      return "fuu";
   }

   @Override
   public int getSoundVolume() {
      return 2;
   }
}
