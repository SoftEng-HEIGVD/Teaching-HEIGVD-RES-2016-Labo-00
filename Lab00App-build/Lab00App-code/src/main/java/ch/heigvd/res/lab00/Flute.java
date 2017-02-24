package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    public String play() {
        return "pfuit";
    }

    public int getSoundVolume() {
        return 1;
    }

    public String getColor() {
        return "silver";
    }
}
