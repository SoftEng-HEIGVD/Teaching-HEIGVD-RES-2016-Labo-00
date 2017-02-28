package ch.heigvd.res.lab00;

/**
 * Created by mathieuurstein on 27.02.16.
 */
public class Trumpet implements IInstrument {
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 20;
    }

    @Override
    public String getColor() {
        return "golden";
    }
}
