/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */

public class Flute implements IInstrument {

   private String color = "brown";

   private int soundVolume = 5;

  

   public Flute() {}

   public String play() {

      return " ";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}