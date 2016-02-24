package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

    public int getSoundVolume() {
        return 2;
    }

    public String getColor() {
        return "golden";
    }
    public String play() {
        return "pouet";
    }
}