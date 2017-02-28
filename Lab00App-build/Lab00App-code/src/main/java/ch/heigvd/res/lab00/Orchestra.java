/*--------------------------------------------------------------------------------
 * Laboratoire: Lab00App-build
 * Fichier:     
 * Autheur:     Yves Athanasiadès
 * Date:        02/03/16
 * 
 * But:         
 *              
 * Remarques:   
 *              
 * Compilateur: jdk 1.8_0_60
 --------------------------------------------------------------------------------*/
package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
   private List<IInstrument> listInstrument;

   public Orchestra() {
      listInstrument = new ArrayList<IInstrument>();
   }

   public void addInstrument(IInstrument i) {
      listInstrument.add(i);
   }

   public int getNumberOfInstruments() {
      return listInstrument.size();
   }

   public List<String> makeMusic() {
      List<String> listSound = new ArrayList<String>();

      for (IInstrument i : listInstrument) {
         listSound.add(i.play());
      }

      return listSound;
   }
}
