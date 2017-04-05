/*
 * 
 * @author Maxime Guillod
 */
package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

    @Override
    public String play() {
        return "";
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
