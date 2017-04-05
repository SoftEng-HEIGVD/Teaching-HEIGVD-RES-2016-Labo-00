package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

	@Override
	public String play() {
		return "Flu";
	}

	@Override
	public int getSoundVolume() {
		return 5;
	}

	@Override
	public String getColor() {
		return "Wood";
	}

}
