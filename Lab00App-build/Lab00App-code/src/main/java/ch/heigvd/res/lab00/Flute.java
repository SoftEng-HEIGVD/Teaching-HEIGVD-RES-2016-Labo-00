package ch.heigvd.res.lab00;

/**
 * Created by galedric on 24.02.16.
 */
public class Flute implements IInstrument {
	@Override
	public String play() {
		return "flûtine";
	}

	@Override
	public int getSoundVolume() {
		return 1;
	}

	@Override
	public String getColor() {
		return "red";
	}
}
