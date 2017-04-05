package ch.heigvd.res.lab00;

/**
 *
 * @author jeanayoub
 */
public class Trumpet implements IInstrument {
   
    public String play() {
        return "pouet";
    }
    
    public int getSoundVolume() {
        return 5;
    }
    
    public String getColor() {
        return "golden";
    }
}
