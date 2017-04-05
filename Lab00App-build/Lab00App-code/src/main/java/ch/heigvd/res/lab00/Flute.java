/*
 * Laboratoire 00
 * Cours de réseau 2017
 * HEIG-VD
 * Created on : 21.02.2017
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Lara Chauffoureaux
 */
public class Flute implements IInstrument {
    
    private String sound = "fiou";
    private String color = "wood";
    private int volume = 30;
    
    @Override
    public String play() {
        
        return sound;
    }
    
    @Override
    public String getColor() {
        
        return color;
    }
    
    @Override
    public int getSoundVolume() {
        
        return volume;
    }
}
