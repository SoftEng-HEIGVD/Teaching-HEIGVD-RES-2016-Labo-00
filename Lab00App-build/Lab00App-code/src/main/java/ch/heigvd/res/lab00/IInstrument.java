package ch.heigvd.res.lab00;

public interface IInstrument {
	String play();
	int getSoundVolume();
	String getColor();
}

class Trumpet implements IInstrument {
	public String play() {
		return "pouet";
	}

	public int getSoundVolume() {
		return 10;
	}

	public String getColor() {
		return "golden";
	}
}

class Flute implements IInstrument {
	public String play() {
		return "fuu";
	}

	public int getSoundVolume() {
		return 5;
	}

	public String getColor() {
		return "white";
	}
}
