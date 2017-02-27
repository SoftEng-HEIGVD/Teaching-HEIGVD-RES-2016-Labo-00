/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author pierre-samuelrochat
 */
public class Flute implements IInstrument{
    public int volume;
    public String color;
    public String sound;
    
    public Flute(){
        this(1, "silver", "Flute");
    }
    
    public Flute(int volume, String color, String sound){
        this.volume = volume;
        this.color = color;
        this.sound = sound;
    }
    
    public String play(){
        return sound;
    }
    public int getSoundVolume(){
        return volume;
    }
    public String getColor(){
        return color;
    }
}