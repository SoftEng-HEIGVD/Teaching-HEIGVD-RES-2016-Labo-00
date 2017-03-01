package ch.heigvd.res.lab00;

public class Bouzouki implements IInstrument {

	@Override
	public String getColor() {
		return "blue";
	}

	@Override
	public int getSoundVolume() {
		return 1;
	}

	@Override
	public String play() {
		return "booooo";
	}
	
}
