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
public class Trumpet implements IInstrument {
    private String sound;
    private int volume;
    private String color;
    
    public Trumpet()
    {
        sound = "pouet";
        volume = 5;
        color = "golden";
    }
    
    public int getSoundVolume()
    {
        return volume;
    }
    public String play()
    {
        return sound;
    }
    public String getColor()
    {
        return color;
    }
    
}
