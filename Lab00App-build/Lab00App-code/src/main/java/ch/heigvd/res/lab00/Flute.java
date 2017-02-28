/**
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : Flute.java
 Auteur(s)   : Andrea Cotza
 Date        : 24.02.2016
 -----------------------------------------------------------------------------------
*/

package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

   public String play() {
      return "trilili";
   }

   public int getSoundVolume() {
      return 10;
   }

   public String getColor() {
      return "golden";
   }

}
