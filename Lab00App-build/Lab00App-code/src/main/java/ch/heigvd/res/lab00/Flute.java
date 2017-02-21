// RES Labo 00
// 
// Author : Nathalie Mégevand
// Date : 21.02.2017

package ch.heigvd.res.lab00;

/**
 * A simple flute
 */
public class Flute implements IInstrument {
    private String sound;
    private String colour;
    private int volume;
    
    public Flute() {
        sound = "Ffffffff";
        colour = "silver";
        volume = 50;
    }
    
    @Override
    public String play() {
        return sound;
    }
            
    
    @Override
    public int getSoundVolume() {
        return volume;
    }
    
    @Override
    public String getColor() {
        return colour;
    }
}
