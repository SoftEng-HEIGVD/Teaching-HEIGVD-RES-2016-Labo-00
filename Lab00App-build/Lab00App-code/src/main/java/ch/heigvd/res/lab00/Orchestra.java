/*
 * RES - Labo00 - fb-orchestra
 */
package ch.heigvd.res.lab00;
import java.util.*;

/**
 *
 * @author Ciani Antony
 */
public class Orchestra {
    
    private int nbInstruments;
    private LinkedList<IInstrument> instruments;

    public Orchestra() {
        instruments = new LinkedList<>();
    }
    
    public int getNumberOfInstruments(){
        return nbInstruments;
    }
    
    public void addInstrument(IInstrument i){
        instruments.add(i);
        nbInstruments++;
    }
    
    public List<String> makeMusic(){
         List<String> sounds = new LinkedList<>();
         
         for(IInstrument i : instruments){
             sounds.add(i.play());
         }
         
         return sounds;
    }
    
}
