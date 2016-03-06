package ch.heigvd.res.lab00;

/**
 * @author Christopher Browne
 */

public class Flute implements IInstrument {
    public String play(){
        return "trilili";
    }
    public String getColor(){
        return "light brown";
    }
    public int getSoundVolume(){
        return 60;
    }
}
