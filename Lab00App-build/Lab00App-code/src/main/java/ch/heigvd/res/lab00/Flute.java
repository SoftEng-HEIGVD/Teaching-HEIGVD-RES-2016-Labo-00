package ch.heigvd.res.lab00;

/**
 * Created by michael on 24.02.16.
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "trilili";
    }

    @Override
    public int getSoundVolume() {
        return 1;
    }

    @Override
    public String getColor() {
        return "brown";
    }
}
