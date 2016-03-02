package ch.heigvd.res.lab00;

/**
 * Created by Benjamin Schubert on 2/24/16.
 */

public class Trumpet implements IInstrument{
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 5;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
