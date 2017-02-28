package ch.heigvd.res.lab00;

/**
 * Created by Colin Lavanchy on 28.02.17.
 */
public class Marimba implements IInstrument {

    public String play() {
        return "dumdumdum";
    }

    public int getSoundVolume() {
        return 15;
    }

    public String getColor() {
        return "brown";
    }
}
