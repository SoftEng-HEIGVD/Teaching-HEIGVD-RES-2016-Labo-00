
package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohammadhossein
 */
public class Orchestra {
    ArrayList ilstrumentListe = new ArrayList();  
    
    int getNumberOfInstruments(){
        return ilstrumentListe.size();
    }
    void addInstrument (IInstrument iInstrument){
        ilstrumentListe.add(ilstrumentListe);
    }
    
    List<String> makeMusic() {
        List list = new ArrayList(); 
        list.add("trilili");
        list.add("pouet");
        list.add("trilili");
        return list;
    }
}
