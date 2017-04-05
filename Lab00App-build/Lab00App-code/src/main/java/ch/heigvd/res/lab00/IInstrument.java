package ch.heigvd.res.lab00;

/**
 * Created by Romain Mercier on 24.02.2016.
 */
public abstract class IInstrument {

    public String play() {
        return "sound";
    }

    public int getSoundVolume() {
        return 0;
    }

    public String getColor() {
        return "color";
    }
}
