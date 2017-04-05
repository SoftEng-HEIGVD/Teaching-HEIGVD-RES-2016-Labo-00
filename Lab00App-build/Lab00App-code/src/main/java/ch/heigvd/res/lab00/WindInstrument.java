package ch.heigvd.res.lab00;

/**
 * Created by Blue Spring on 22.02.2017.
 */
public abstract class WindInstrument implements IInstrument {

    private String sound;
    private int volume;
    private String color;

    WindInstrument(String sound, int volume, String color) {
        this.sound = sound;
        this.volume = volume;
        this.color = color;
    }

    public String play() {
        return sound;
    }

    public int getSoundVolume() {
        return volume;
    }

    public String getColor() {
        return color;
    }


}
