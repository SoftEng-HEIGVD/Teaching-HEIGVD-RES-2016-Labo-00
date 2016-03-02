/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.LinkedList;

/**
 *
 * @author Antoine
 */
public class Orchestra {
    LinkedList<IInstrument> instruments;
    
    public Orchestra(){
        instruments = new LinkedList<IInstrument>();
    }
    public int getNumberOfInstruments(){
        return instruments.size();
    }
    public void addInstrument(IInstrument instrument){
        instruments.add(instrument);
    }
    public LinkedList<String> makeMusic(){
        LinkedList<String> l = new LinkedList<String>();
        for(IInstrument i : instruments){
            l.add(i.play());
        }
        return l;
    }
}
