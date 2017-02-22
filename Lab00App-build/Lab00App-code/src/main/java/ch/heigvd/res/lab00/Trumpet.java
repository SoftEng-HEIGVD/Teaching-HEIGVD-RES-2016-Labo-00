package ch.heigvd.res.lab00;

/**
* This is a Trumpet, implements IInstrument
* 
* @author Lawrence Stalder
*/
public class Trumpet implements IInstrument {
	private final String COLOR = "golden";
	private final String SOUND = "pouet";
	private final int VOLUME = 10;
	
	public String play() {
		return SOUND;
	}

	public int getSoundVolume() {
		return VOLUME;
	}

	public String getColor() {
		return COLOR;
	}
}