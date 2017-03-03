package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {


	private int soundVolume = 25;
	private String color = "golden";
	private String sound = "pouet";

	public String getColor(){

		return color;	
	}

	public String play(){

		return sound;
	}

	public int getSoundVolume(){

			return soundVolume;
		}
}