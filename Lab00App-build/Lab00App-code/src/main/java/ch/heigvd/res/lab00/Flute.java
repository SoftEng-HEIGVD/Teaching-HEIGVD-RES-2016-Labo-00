package ch.heigvd.res.lab00;

/**
 * Created by celestius on 21.02.17.
 */
public class Flute implements IInstrument {

    @Override
    public String play() {
        return "flululu";
    }

    @Override
    public int getSoundVolume() {
        return 20;
    }

    @Override
    public String getColor() {
        return "brown";
    }


}
