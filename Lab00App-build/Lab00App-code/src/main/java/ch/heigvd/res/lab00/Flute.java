package ch.heigvd.res.lab00;

/**
 * Created by Romain Mercier on 24.02.2016.
 */
public class Flute extends IInstrument {

    @Override
    public String play(){
        return "fuuuu";
    }

    @Override
    public int getSoundVolume(){
        return 30;
    }

    @Override
    public String getColor(){
        return "Brown";
    }
}
