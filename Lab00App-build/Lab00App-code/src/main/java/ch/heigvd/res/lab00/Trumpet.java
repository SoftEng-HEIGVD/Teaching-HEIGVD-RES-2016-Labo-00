/**
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : Trumpet.java
 Auteur(s)   : Andrea Cotza
 Date        : 24.02.2016
 -----------------------------------------------------------------------------------
*/

package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

   public String play() {
      return "pouet";
   }

   public int getSoundVolume() {
      return 25;
   }

   public String getColor() {
      return "golden";
   }
}
