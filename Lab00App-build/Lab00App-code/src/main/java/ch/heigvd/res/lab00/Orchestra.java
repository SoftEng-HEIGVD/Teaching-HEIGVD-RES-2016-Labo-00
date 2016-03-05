
package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohammadhossein
 */
public class Orchestra {
    ArrayList<IInstrument> ilstrumentListe = new ArrayList<IInstrument>();  
    
    int getNumberOfInstruments(){
        return ilstrumentListe.size();
    }
    void addInstrument (IInstrument iInstrument){
        ilstrumentListe.add(iInstrument);
    }
    
    List<String> makeMusic() {
        List list = new ArrayList(); 
        for(IInstrument i : ilstrumentListe)
            list.add(i.play());
        return list;
    }
}
