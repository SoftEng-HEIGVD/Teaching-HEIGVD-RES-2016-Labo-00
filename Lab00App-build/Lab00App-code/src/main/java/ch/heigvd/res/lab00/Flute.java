package ch.heigvd.res.lab00;

/**
 * Created by sebbos on 24.02.2016.
 */
public class Flute implements IInstrument {
    private String sound;
    private String color;
    private int soundsLevel;

    public Flute() {
        sound = "trilili";
        color = "black";
        soundsLevel = 10;
    }

    /*public Flute(String sound, String color, int soundsLevel) {
        this.sound = sound;
        this.color = color;
        this.soundsLevel = soundsLevel;
    }*/

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return soundsLevel;
    }

    public String getColor() {
        return color;
    }
}
