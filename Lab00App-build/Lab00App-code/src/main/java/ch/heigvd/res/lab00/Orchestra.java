package ch.heigvd.res.lab00;

import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author jeanayoub
 */
public class Orchestra {
    
    Orchestra () {
       allInstruments = new LinkedList <IInstrument> (); 
    }
    
    public int getNumberOfInstruments() {
        return allInstruments.size();
    }
    
    
    public void addInstrument(IInstrument instrument) {
        allInstruments.add(instrument);
    }
    
    
    public List<String> makeMusic() {
        List <String> list = new LinkedList <String>();
        
        for (IInstrument i : allInstruments)
            list.add(i.play());
        
        return list;
    }
    
    private List <IInstrument> allInstruments; 
}
