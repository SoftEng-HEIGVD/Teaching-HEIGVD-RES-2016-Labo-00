package ch.heigvd.res.lab00;

/**
 * @author Damien Rochat
 */
public class Flute implements IInstrument {

    public String play() {
        return "trilili";
    }

    public int getSoundVolume() {
        return 40;
    }

    public String getColor() {
        return "braun";
    }
}
