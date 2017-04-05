// RES Labo 00
// 
// Author : Nathalie Mégevand
// Date : 21.02.2017

package ch.heigvd.res.lab00;

/**
 * A trumpet that makes "pouet" sounds at 80 dB and is golden.
 */
public class Trumpet implements IInstrument {
    
    private String sound;
    private String colour;
    private int volume;
    
    public Trumpet() {
        sound = "pouet";
        colour = "golden";
        volume = 70;
    }
    
    public String play() {
        return sound;
    }
            
    
    public int getSoundVolume() {
        return volume;
    }
    
    public String getColor() {
        return colour;
    }
}
