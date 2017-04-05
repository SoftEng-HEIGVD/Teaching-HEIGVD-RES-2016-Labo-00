package ch.heigvd.res.lab00;

/**
 * Created by ALi on 24/02/2017.
 */
public class Flute implements IInstrument {

    private int soundVolume;
    private String color;

    public Flute(){
        soundVolume = 1;
        color = "brown";
    }

    @Override
    public String play() {
        return null;
    }

    public int getSoundVolume(){
        return soundVolume;
    }

    public String getColor(){
        return color;
    }
}
