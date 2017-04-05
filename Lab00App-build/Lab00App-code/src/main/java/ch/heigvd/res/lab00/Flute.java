/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Yosra
 */
public class Flute implements IInstrument{
    public Flute(){
        sound = "tootle-too";
        color = "silver";
        soundVolume = 50;
    }
    public String play(){
        return sound;
    }
    public String getColor(){
        return color;
    }
    
    public int getSoundVolume(){
        return soundVolume;
    }
    
    private String sound;
    private String color;
    private int soundVolume; 
}
