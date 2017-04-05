package ch.heigvd.res.lab00;

interface IInstrument {

	public String play();
	public String getColor();
	public int getSoundVolume();
}
public class Trumpet implements IInstrument {

	private String sound;
	private String color;
	private int volume;

	public Trumpet() {
		sound = "pouet";
		color = "golden";
		volume = 2;
	}

	public String play() {
		return sound;
	}
	public String getColor() {
		return color;
	}
	public int getSoundVolume() {
		return volume;
	}

}
class Flute implements IInstrument {

	private String sound;
	private String color;
	private int volume;

	public Flute() {
		sound = "pouet";
		color = "golden";
		volume = 1;
	}

	public String play() {
		return sound;
	}
	public String getColor() {
		return color;
	}
	public int getSoundVolume() {
		return volume;
	}
}