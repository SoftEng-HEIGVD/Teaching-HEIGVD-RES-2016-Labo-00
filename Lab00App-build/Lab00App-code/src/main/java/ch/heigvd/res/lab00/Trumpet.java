/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

interface IInstrument {
   String play();
   int getSoundVolume();
   String getColor();
}

/**
 *
 * @author Miguel-Portable
 */
class Trumpet implements IInstrument{
   public String play(){
      return "pouet";
   }

   public int getSoundVolume() {
      return 50;
   }

   public String getColor() {
      return "golden";
   }
}

class Flute implements IInstrument{
   public String play(){
      return "fuuuu";
   }
   
   public int getSoundVolume() {
      return 40;
   }
   
   public String getColor() {
      return "brown";
   }
}
