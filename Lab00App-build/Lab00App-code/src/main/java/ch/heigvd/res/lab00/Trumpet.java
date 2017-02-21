package ch.heigvd.res.lab00;

/**
 * Created by Juju on 21.02.2017.
 */
public class Trumpet implements IInstrument {
    String color = "golden";
    int soundVolume = 10;

    public String play() {
        return "pouet";
    }
    public String getColor() {
        return this.color;
    }
    public int getSoundVolume() {
        return soundVolume;
    }
}