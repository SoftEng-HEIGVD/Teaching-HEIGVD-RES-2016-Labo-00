package ch.heigvd.res.lab00;

/**
 * Created by verdo on 24.02.2016.
 */
public class Flute implements IInstrument {
    public int getSoundVolume(){
        return this.soundVolume;
    }

    public String getColor() {
        return null;
    }

    public String play() {
        return "trilili";
    }

    int soundVolume = 1;
}
