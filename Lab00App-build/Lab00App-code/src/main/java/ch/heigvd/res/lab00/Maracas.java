package ch.heigvd.res.lab00;

/**
 *
 * @author arthur
 */
public class Maracas {
 
    private int soundVolume = 18;
	private String color = "brown";
	private String sound = "TshTsh";

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
