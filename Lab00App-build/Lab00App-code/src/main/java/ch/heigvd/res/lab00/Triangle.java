package ch.heigvd.res.lab00;

/**
 * @author Mika Pagani
 */
public class Triangle implements IInstrument {

    public String play() {
    	return "ding";
	}

    public int getSoundVolume() {
    	return 1;
    }

    public String getColor() {
    	return "silver";
    }

}