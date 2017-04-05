package ch.heigvd.res.lab00;

/**
 * Created by ALi on 24/02/2017.
 */
public class Trumpet implements IInstrument {

    private int soundVolume;
    private String color;

    public Trumpet(){
        soundVolume = 2;
        color = "golden";
    }

    @Override
    public String play(){
        return "pouet";
    }

    public int getSoundVolume(){
        return soundVolume;
    }

    public String getColor(){
        return color;
    }
}
