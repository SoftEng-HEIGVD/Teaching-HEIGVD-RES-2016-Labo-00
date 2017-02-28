package ch.heigvd.res.lab00;

/**
 *
 * @author David Truan
 */
public class Flute implements IInstrument {
    public String play() {
        return "fiou";
    }
    
    public int getSoundVolume() {
        return 5;
    }
    
    public String getColor() {
        return "black"; // we return an arbitrary color (black here)
    }
}
