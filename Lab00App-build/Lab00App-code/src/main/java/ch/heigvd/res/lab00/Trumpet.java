/**
 * Labo 01 - Rémi Jacquemard
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Remi
 */
public class Trumpet implements IInstrument {

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String getColor() {
        return "golden";
    }
    
   
    
}
