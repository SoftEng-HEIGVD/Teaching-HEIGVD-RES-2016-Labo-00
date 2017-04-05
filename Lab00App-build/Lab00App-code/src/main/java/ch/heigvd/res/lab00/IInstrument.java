package ch.heigvd.res.lab00;

public abstract class IInstrument {
	private String color;
	private int soundVolume;
	
	public IInstrument(int soundVolume, String color) {
		this.color = color;
		this.soundVolume = soundVolume;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getSoundVolume() {
		return soundVolume;
	}
	
	abstract String play();
}
