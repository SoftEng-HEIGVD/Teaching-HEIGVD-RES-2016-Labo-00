/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Thomas
 */
public class Flute implements IInstrument {
    
    private String sound;
    private int fluteVolume;
    private String color;
    
    public Flute(){
        this.sound = "trilili";
        this.fluteVolume = 5;
        this.color = "black";
    }
    public String play(){
        return sound;
    }
    
    public int getSoundVolume() {
        return fluteVolume;
    }
    
    public String getColor() {
        return color;
    }
    
}
