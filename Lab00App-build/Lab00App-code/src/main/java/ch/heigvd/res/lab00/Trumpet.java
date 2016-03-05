package ch.heigvd.res.lab00;

/**
 * Created by sebbos on 24.02.2016.
 */
public class Trumpet implements IInstrument {
    private String sound;
    private String color;
    private int soundLevel;

    public Trumpet() {
        sound = "pouet";
        color = "golden";
        soundLevel = 20;
    }

    /*public Trumpet(String sound, String color, int soundLevel) {
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
