package ch.heigvd.res.lab00;

/**
 * Created by verdo on 24.02.2016.
 */
public class Trumpet implements IInstrument {
    public String play(){
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    public int getSoundVolume(){
        return this.soundVolume;
    }

    int soundVolume = 2;
}
