package ch.heigvd.res.lab00;

/**
 * Created by Mado on 24.02.2016.
 */
public class Trumpet implements IInstrument{

    public String play() {
        return "pouet";
    }

    public int getSoundVolume() {
        return 20;
    }

    public String getColor() {
        return "golden";
    }
}
