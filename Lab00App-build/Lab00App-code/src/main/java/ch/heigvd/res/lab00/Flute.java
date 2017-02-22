package ch.heigvd.res.lab00;

/**
 * @author Ludovic Delafontaine
 */
public class Flute implements IInstrument {

    private String sound = "flûûûte";
    private int volume = 20;
    private String color = "brown";

    public Flute() { }

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }
}
