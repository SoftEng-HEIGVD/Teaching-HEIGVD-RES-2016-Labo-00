package ch.heigvd.res.lab00;

/**
 * Created by Benjamin Schubert on 2/24/16.
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "trilili";
    }

    @Override
    public int getSoundVolume() {
        return 3;
    }

    @Override
    public String getColor() {
        return "silver";
    }
}
