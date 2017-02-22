package ch.heigvd.res.lab00;

/**
 * @author Ludovic Delafontaine
 */
public class Trumpet implements IInstrument {

    private String sound = "pouet";
    private int volume = 50;
    private String color = "golden";

    public Trumpet() { }

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
