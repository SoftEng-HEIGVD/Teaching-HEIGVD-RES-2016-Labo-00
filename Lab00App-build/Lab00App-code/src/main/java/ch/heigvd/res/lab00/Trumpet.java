package ch.heigvd.res.lab00;



public class Trumpet implements IInstrument {
	
	private String color = "golden";
	private int soundVolume = 10;
	
	public Trumpet() {
		//this("Golden");	
	}
	
	public String play() {
		return "pouet";
	}
	
	public int getSoundVolume() {
		return soundVolume;
	}
	
	public String getColor() {
		return color;
	}
	
}