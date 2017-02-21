package ch.heigvd.res.lab00;

/**
 * Created by Xavier on 21.02.2017.
 */
public class Flute implements IInstrument {

    private String color = "pink";
    private int soundVolume = 5;
    private String sound = "fuuuu";

    public Flute() {}

    public String play() { return sound; }

    public int getSoundVolume() { return this.soundVolume; }

    public String getColor() { return this.color; }
}
