/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author SILVERCORP
 */
 class Flute implements IInstrument {
    
   
    @Override
    public int getSoundVolume(){    
        return (int)5;    }
    
    @Override
    public String play(){return "";}
    
    @Override
    public String getColor(){ return "";}
    
}
