package ch.heigvd.res.lab00;

/**
 * Created by sebbos on 24.02.2016.
 */
public class Flute implements IInstrument {
    private String sound;
    private String color;
    private int soundVolume;

    public Flute() {
        sound = "plouc";
        color = "black";
        soundVolume = 10;
    }

    /*public Flute(String sound, String color, int soundVolume) {
        this.sound = sound;
        this.color = color;
        this.soundVolume = soundVolume;
    }*/

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public String getColor() {
        return color;
    }
}
