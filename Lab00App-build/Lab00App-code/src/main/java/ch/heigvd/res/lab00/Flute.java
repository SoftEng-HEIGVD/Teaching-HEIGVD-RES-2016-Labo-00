/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author rosanne
 */
public class Flute implements IInstrument {
    private String sound;
    private int volume;
    private String color;
    
    public Flute()
    {
        sound = "tutu";
        volume = 2;
        color = "brown";
    }
    public String play()
    {
        return sound;
    }
    public int getSoundVolume()
    {
        return volume;
    }
    public String getColor()
    {
        return color;
    }
    
}
