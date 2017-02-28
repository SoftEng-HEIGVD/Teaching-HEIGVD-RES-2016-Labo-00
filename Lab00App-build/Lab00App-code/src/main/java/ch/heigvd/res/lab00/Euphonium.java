package ch.heigvd.res.lab00;

/**
 * 
 * @author Maxime Guillod
 */
public class Euphonium implements IInstrument {

    @Override
    public String play() {
        return "trum";
    }

    @Override
    public int getSoundVolume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

}
