/*
 * RES Labo00 - fb-orchestra
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Ciani Antony
 */
public class Flute implements IInstrument{
    
    public String play(){
        return "trilili";
    }
    
    public int getSoundVolume(){
        return 10;
    }
    
    public String getColor(){
        return "wooden";
    }
    
}
