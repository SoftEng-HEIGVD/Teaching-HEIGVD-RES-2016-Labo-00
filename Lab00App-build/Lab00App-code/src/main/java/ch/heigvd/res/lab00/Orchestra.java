package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {
    public Orchestra() {
        instruments = new LinkedList<IInstrument>();
    }
    
    public int getNumberOfInstruments() {
        return instruments.size();
    }
    
    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);
    }
    
    public List<String> makeMusic() {
        List<String> music = new LinkedList<String>();
        
        for (IInstrument instrument : instruments) {
            music.add(instrument.play());
        }
      
        return music;
    }
    
    private List<IInstrument> instruments;
}
