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
public class Trumpet implements IInstrument{
    
    public int volume;
    public String color;
    public String sound;
    
    public Trumpet(){
        this(2, "golden", "pouet");
    }
    
    public Trumpet(int volume, String color, String sound){
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