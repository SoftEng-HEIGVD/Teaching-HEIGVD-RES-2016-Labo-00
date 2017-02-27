package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
    public Flute() {}

    public String play() {
        return "fluuuuute";
    }

    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "white";
    }
}
