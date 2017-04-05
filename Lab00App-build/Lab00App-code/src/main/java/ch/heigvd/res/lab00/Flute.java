package ch.heigvd.res.lab00;

/**
 *
 * @author christopher
 */
public class Flute implements IInstrument {
    public String play() {
        return "fu";
    }

    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "silver";
    }
}
