package ch.heigvd.res.lab00;

public class Trumpet extends IInstrument {
	private final static String COLOR = "golden";
	private final static int SOUND_VOLUME = 65;		// Décibels
	
	public Trumpet() {
		super(SOUND_VOLUME, COLOR);
	}

	@Override
	String play() {
		return "pouet";
	}
	
}
