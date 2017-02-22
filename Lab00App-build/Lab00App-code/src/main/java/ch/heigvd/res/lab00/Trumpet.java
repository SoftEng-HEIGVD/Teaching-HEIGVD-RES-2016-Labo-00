package ch.heigvd.res.lab00;

/**
 * Created by Thuy-My on 22.02.2017.
 */
public class Trumpet implements IInstrument {
    private String sound = "pouet";
    private String color = "golden";
    private int volume = 10;

    public Trumpet() {
    }

    public String play() {
        return sound;
    }

    public String getColor() {
        return color;
    }

    public int getSoundVolume() {
        return volume;
    }
}
