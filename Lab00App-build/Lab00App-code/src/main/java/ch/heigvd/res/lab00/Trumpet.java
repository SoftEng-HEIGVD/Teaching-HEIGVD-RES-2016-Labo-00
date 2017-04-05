package ch.heigvd.res.lab00;

/**
 * Created by Xavier on 21.02.2017.
 */
public class Trumpet implements IInstrument {

    private String color = "golden";
    private int soundVolume = 10;
    private String sound = "pouet";

    public Trumpet(){}

    public String play() { return sound; }

    public int getSoundVolume() { return soundVolume; }

    public String getColor() { return this.color; }

}
