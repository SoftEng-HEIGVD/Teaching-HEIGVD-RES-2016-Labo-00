package ch.heigvd.res.lab00;

/**
 * Created by Mado on 24.02.2016.
 */
public class Flute implements IInstrument {

    public int getSoundVolume() {
        return 5;
    }

    public String play() {
        return "pfiou";
    }

    public String getColor() {
        return "brown";
    }
}
