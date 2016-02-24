package ch.heigvd.res.lab00;

/**
 * @author Damien Rochat
 */
public class Trumpet implements IInstrument {

    public String play() {
        return "pouet";
    }

    public int getSoundVolume() {
        return 60;
    }

    public String getColor() {
        return "golden";
    }
}
