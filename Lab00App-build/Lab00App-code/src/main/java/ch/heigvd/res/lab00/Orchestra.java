/*
 * HEIG-VD / MCR 
 * Ioannis Noukakis && Djomo Patrick Deslé
 * Laboratoire N°01
 * File : Orchestra.java
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author durza9390
 */
public class Orchestra {
    LinkedList<IInstrument> liste = new LinkedList();
    
    public int getNumberOfInstruments(){
        return liste.size();
    }
    
    public void addInstrument(IInstrument i)
    {
        liste.add(i);
    }
    
    public List<String> makeMusic()
    {
        LinkedList<String> sounds = new LinkedList();
        
        for(IInstrument i : liste)
        {
            sounds.add(i.play());
        }
        return sounds;
    }
}
