/*
 * HEIG-VD / POO 
 * Ioannis Noukakis && Djomo Patrick Deslé
 * Laboratoire N°09
 * File : Trumpet.java
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author durza9390
 */
public class Trumpet implements IInstrument{
    
    @Override
    public String play()
    {
        return "pouet";
    }
    
    @Override
    public int getSoundVolume()
    {
        return 20;
    }
    
    @Override
    public String getColor()
    {
        return "golden";
    }
}
