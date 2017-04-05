package ch.heigvd.res.lab00;

/**
 * Created by sebbos on 24.02.2016.
 */
public class Flute implements IInstrument {
    private String sound;
    private String color;
    private int soundLevel;

    public Flute() {
        sound = "trilili";
        color = "black";
        soundLevel = 10;
    }

    /*public Flute(String sound, String color, int soundLevel) {
        this.sound = sound;
        this.color = color;
        this.soundLevel = soundLevel;
    }*/

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundLevel;
    }

    public String getColor() {
        return color;
    }
}
