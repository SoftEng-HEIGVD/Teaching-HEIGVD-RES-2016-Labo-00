package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: Lab00App-build
 * Created by jdavid on 02.03.16.
 */
public class Orchestra {

   private ArrayList<IInstrument> instruments;

   public Orchestra() {
      instruments = new ArrayList<IInstrument>();
   }

   public void addInstrument(IInstrument instrument) {
      instruments.add(instrument);
   }

   public int getNumberOfInstruments() {
      return instruments.size();
   }

   public List<String> makeMusic() {
      return instruments
         .stream()
         .map(IInstrument::play)
         .collect(Collectors.toList());
   }
}
