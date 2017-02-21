package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {
	Trumpet() {
		color = "golden";
		sound = "pouet";
		volume = 10;
	}
	
	public String play() {
		return sound;
	}

	public int getSoundVolume() {
		return volume;
	}

	public String getColor() {
		return color;
	}
}