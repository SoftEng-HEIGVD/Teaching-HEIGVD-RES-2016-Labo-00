/**
 * Labo 01 - Rémi Jacquemard
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Remi
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "fiouuu";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        return "yellow";
    }
    
}
