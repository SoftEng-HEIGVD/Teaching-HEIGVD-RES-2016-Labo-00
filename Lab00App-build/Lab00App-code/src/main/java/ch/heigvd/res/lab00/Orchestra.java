/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Hernandez
 */
public class Orchestra {
    
    private List<IInstrument> instruments;
    
    public Orchestra(){
        instruments = new ArrayList<>();
    }
        
    public int getNumberOfInstruments() {
        return instruments.size();
    }
    
    public void addInstrument(IInstrument instrument) {
        instruments.add(instrument);     
    }
    
    public List<String> makeMusic() {
        List<String> sounds = new ArrayList<>();
        for(IInstrument inst : instruments){
            sounds.add(inst.play());
        }
        return sounds;
    }
    
}
