/**
 * Fichier: Flute.java
 * Auteur : Francois Quellec
 * Email  : francois.quellec@heig-vd.ch
 * Date   : 21 févr. 2017
 * Projet : Programmation Oriente Objet : TE2
 */

package ch.heigvd.res.lab00;


    public class Flute implements IInstrument{
      static final int SOUND_VOLUME = 2;
      public String play(){
          return "tututu";
      }
      public int getSoundVolume(){
          return  SOUND_VOLUME;
      }
      public String getColor(){
          return "bleu";
      }
  }