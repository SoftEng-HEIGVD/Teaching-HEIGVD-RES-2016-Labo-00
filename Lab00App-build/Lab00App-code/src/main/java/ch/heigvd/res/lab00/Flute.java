package ch.heigvd.res.lab00;

/**
 * Project : Lab00App-build
 * Author(s) : Antoine Friant
 * Date : 20.02.17
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
