package ch.heigvd.res.lab00;

/**
 * Created by celestius on 21.02.17.
 */
public class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 50;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
