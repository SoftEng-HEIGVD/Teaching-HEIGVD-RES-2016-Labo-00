
package ch.heigvd.res.lab00;

/**
 *
 * @author Sims
 */
public class Flute implements IInstrument {
    
    @Override
    public int getSoundVolume() {
    return 10;
    }
    @Override
    public String play() {
    return "toot"; 
    }
    @Override
    public String getColor() {
    return "brown"; 
    }
}
