/*
 * Author:            Rosanne Combremont, HEIG-VD
 * Creation:          27.02.16
 * Last modification: 27.02.16
 */
package ch.heigvd.res.lab00;


public class Flute implements IInstrument {
    private String sound;
    private int volume;
    private String color;
    
    public Flute()
    {
        sound = "trilili";
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
