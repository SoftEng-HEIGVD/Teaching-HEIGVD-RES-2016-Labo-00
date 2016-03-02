/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author guillaume
 */
public class Orchestra {
    
    private LinkedList<IInstrument> instruments;
    
    Orchestra(){
        instruments = new LinkedList();
    }
    int getNumberOfInstruments(){
        int cpt = 0;
        for(IInstrument i : instruments)
            cpt++;
        return cpt;
    }
    void addInstrument(IInstrument i){
        instruments.add(i);
    }
    
    List<String> makeMusic(){
        LinkedList<String> l = new LinkedList();
        for(IInstrument i : instruments)
            l.add(i.play());
        return l;

    }
    
}
