package ch.heigvd.res.lab00;

/**
 * Created by sebbos on 24.02.2016.
 */
public class Trumpet implements IInstrument {
    private String sound;
    private String color;
    private int soundsLevel;

    public Trumpet() {
        sound = "pouet";
        color = "golden";
        soundsLevel = 20;
    }

    /*public Trumpet(String sound, String color, int soundsLevel) {
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
