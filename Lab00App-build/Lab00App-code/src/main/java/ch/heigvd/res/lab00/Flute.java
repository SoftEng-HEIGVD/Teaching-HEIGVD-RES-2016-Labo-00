package ch.heigvd.res.lab00;

/**
 * Created by Thuy-My on 22.02.2017.
 */
public class Flute implements IInstrument {
    private int volume = 5;
    private String sound = "tut";
    private String color = "beige";

    public Flute() {
    }

    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public String getColor() {
        return color;
    }
}
