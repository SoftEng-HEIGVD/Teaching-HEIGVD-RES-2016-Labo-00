package ch.heigvd.res.lab00;

/**
 *
 * @author Amel Dussier
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
