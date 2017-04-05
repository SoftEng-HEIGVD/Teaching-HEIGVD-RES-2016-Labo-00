/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author amh
 */
public class Flute implements IInstrument{
    
    @Override
    public String play(){
        return "pouet";
    }
    
    @Override
    public int getSoundVolume(){
        return volume;
    }
    
    @Override
    public String getColor(){
        return color;
    }
    
    private String color = "wood";     // default value
    private int volume   = 5;       // default value
    
}
