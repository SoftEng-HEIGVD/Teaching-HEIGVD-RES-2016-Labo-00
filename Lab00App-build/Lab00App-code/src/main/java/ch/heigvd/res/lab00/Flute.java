package ch.heigvd.res.lab00;

public class Flute extends IInstrument {
	private final static String COLOR = "black";
	private final static int SOUND_VOLUME = 35;
	
	public Flute() {
		super(SOUND_VOLUME, COLOR);
	}

	@Override
	String play() {
		return "Luuu";
	}

}
