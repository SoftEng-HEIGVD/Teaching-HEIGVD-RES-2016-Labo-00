package ch.heigvd.res.lab00;

/*--------------------------------------------------------------------------------
 * Laboratoire: Lab00App-build
 * Fichier:     
 * Autheur:      Yves Athanasiadès
 * Date:        24/02/16
 * 
 * But:         
 *              
 * Remarques:   
 *              
 * Compilateur: jdk 1.8_0_60
 --------------------------------------------------------------------------------*/
public class Flute implements IInstrument {
   public String play() {
      return "tuut";
   }

   public int getSoundVolume() {
      return 1;
   }

   public String getColor() {
      return "argent";
   }
}
