/*
 -----------------------------------------------------------------------------------
 Laboratoire : <nn>
 Fichier     : Trumpet.java
 Auteur(s)   : Samuel Darcey
 Date        : 24.02.2016

 But         : <à compléter>

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {
   public String play(){
      return "pouet";
   }
   public int getSoundVolume(){
      return 2;
   }
   public String getColor(){
      return "golden";
   }
}
