package ch.heigvd.res.lab00;

public class Flute implements IInstrument {

	private int soundVolume = 15;
	private String color = "white";
	private String sound = "Flufluflu";

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