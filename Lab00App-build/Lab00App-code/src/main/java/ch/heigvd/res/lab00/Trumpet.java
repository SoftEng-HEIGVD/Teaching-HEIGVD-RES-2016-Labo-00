package ch.heigvd.res.lab00;

interface IInstrument {
	public int getSoundVolume();
	public String play();
	public String getColor();
}

public class Trumpet implements IInstrument {


	public Trumpet() 
	{
		volume = 100;
		sound = "pouet";
		color = "golden";
	}
	
	public int getSoundVolume() 
	{
		return volume;
	}
	
	public String play() 
	{
		return sound;
	}


	public String getColor() {
		return color;
	}
 
	private int volume;
	private String sound;
	private String color;

}
	
class Flute implements IInstrument {

	public Flute() 
	{
		volume = 50;
		sound = "pouet";
		color = "white";
	}
	
	public int getSoundVolume() 
	{
		return volume;
	}
	
	public String play() 
	{
		return sound;
	}


	public String getColor() {
		return color;
	}
 
 
	private int volume;
	private String sound;
	private String color;

}



