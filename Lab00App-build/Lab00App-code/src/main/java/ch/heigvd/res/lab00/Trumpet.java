package ch.heigvd.res.lab00;


/**
 * Created by galedric on 24.02.16.
 */
public class Trumpet implements IInstrument {
	@Override
	public String play() {
		return "pouet";
	}

	@Override
	public int getSoundVolume() {
		return 9999;
	}

	@Override
	public String getColor() {
		return "golden";
	}
}
