/*
 * HEIG-VD / POO 
 * Ioannis Noukakis && Djomo Patrick Deslé
 * Laboratoire N°09
 * File : Flute.java
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author durza9390
 */
public class Flute implements IInstrument{
    
    @Override
    public String play()
    {
        return "trilili";
    }
    
    @Override
    public int getSoundVolume()
    {
        return 10;
    }    
    
    @Override
    public String getColor()
    {
        return "grey";
    }
}
