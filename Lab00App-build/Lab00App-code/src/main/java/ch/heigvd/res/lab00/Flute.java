package ch.heigvd.res.lab00;

/**
* Flute, another instrument
* 
* @author Lawrence Stalder
*/
public class Flute implements IInstrument {
	private final int VOLUME = 5;

	public String play() {
		return "";
	}

	public int getSoundVolume() {
		return VOLUME;
	}

	public String getColor() {
		return "";
	}
}