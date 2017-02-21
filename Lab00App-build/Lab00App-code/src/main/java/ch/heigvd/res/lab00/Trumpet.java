package ch.heigvd.res.lab00;

/**
 * Created by Mathias on 21/02/2017.
 */

public class Trumpet implements IInstrument{

    @Override
    public String play(){
        return "pouet";
    }

    @Override
    public String getColor() {
        return "golden";
    }

    @Override
    public int getSoundVolume() {
        return 100;
    }
}


