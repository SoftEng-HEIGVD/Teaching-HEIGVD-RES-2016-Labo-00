package ch.heigvd.res.lab00;

/**
 * Created by Ornidon on 24.02.2016.
 */
public abstract class IInstrument {

    private int soundVolume;
    private String color;

    IInstrument(int sound, String col){
        soundVolume = sound;
        color = col;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }

    public String play() {
        return "";
    }
}
