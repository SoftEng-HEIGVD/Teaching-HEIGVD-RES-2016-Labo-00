
package ch.heigvd.res.lab00;

/**
 *
 * @author Sims
 */
public class Trumpet implements IInstrument{
    @Override
    public int getSoundVolume() {
    return 20; 
    }
    @Override
    public String play() {
    return "pouet"; 
    }
    @Override
    public String getColor() {
    return "golden"; 
    }
}
