package ch.heigvd.res.lab00;

/**
 * Created by Romain Mercier on 24.02.2016.
 */
public class Trumpet extends IInstrument {

    @Override
    public String play(){
        return "pouet";
    }

    @Override
    public int getSoundVolume(){
        return 9009;
    }

    @Override
    public String getColor(){
        return "golden";
    }
}
