package ch.heigvd.res.lab00;

/**
 * Created by Juju on 21.02.2017.
 */
public class Flute implements IInstrument {
    int soundVolume = 5;
    String color = "brun";

    public String play() {
        return "zuu";
    }
    public int getSoundVolume() {
        return soundVolume;
    }
    public String getColor() { return color; }
}
