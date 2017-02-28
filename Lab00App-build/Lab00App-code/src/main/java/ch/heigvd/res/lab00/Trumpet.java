/*
 * Author:            Rosanne Combremont, HEIG-VD
 * Creation:          27.02.16
 * Last modification: 27.02.16
 */
package ch.heigvd.res.lab00;


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
