/**
 -----------------------------------------------------------------------------------
 Laboratoire : 00b
 Fichier     : Orchestra.java
 Auteur(s)   : Andrea Cotza
 Date        : 02.03.2016
 -----------------------------------------------------------------------------------
*/

package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {

   private List<IInstrument> instruments = new ArrayList<IInstrument>();

   public int getNumberOfInstruments() {
      return instruments.size();
   }

   public void addInstrument(IInstrument instrument) {
      instruments.add(instrument);
   }

   public List<String> makeMusic() {
      List<String> music = new ArrayList<String>();

      for (IInstrument instrument : instruments) {
         music.add(instrument.play());
      }

      return music;
   }
}
