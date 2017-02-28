/*
 -----------------------------------------------------------------------------------
 Laboratoire : 00
 Fichier     : Orchestra.java
 Auteur(s)   : Guillaume Serneels
 Date        : 04.03.2016
 But         : Implémentation de l'orchestre
 -----------------------------------------------------------------------------------
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
        return instruments.size();
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
