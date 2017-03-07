package ch.heigvd.res.lab00;

/**
 * Project : Lab00App-build
 * Author(s) : Antoine Friant
 * Date : 20.02.17
 */
public class Trumpet implements IInstrument {
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
