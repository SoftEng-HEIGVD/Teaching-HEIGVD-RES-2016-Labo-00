/*
 -----------------------------------------------------------------------------------
 Laboratoire : <nn>
 Fichier     : Flute.java
 Auteur(s)   : Samuel Darcey
 Date        : 24.02.2016

 But         : <à compléter>

 Remarque(s) : <à compléter>

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

package ch.heigvd.res.lab00;

public class Flute implements IInstrument{
   public String play(){
      return "trilili";
   }
   public int getSoundVolume(){
      return 1;
   }
   public String getColor(){
      return "white";
   }
}
