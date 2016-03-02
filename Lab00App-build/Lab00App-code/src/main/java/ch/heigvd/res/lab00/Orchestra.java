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
 * @author riplin
 */
public class Orchestra {
    
    List<IInstrument> instruments;
    
    public Orchestra()
    {
        instruments = new ArrayList<IInstrument>();
    }
    
    public void addInstrument(IInstrument instrument)
    {
        instruments.add(instrument);
    }
    
    public List<String> makeMusic()
    {
        List<String> list = new ArrayList<String>();
        
        for(IInstrument instrument : instruments)
        {
            list.add(instrument.play());
        }
        
        return list;
    }
    
    public int getNumberOfInstruments()
    {
        return instruments.size();
    }
}
