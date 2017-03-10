package ch.heigvd.res.lab00;

/** 
* @author David Truan
*/

class Bassoon implements IInstrument{
	public String play() {
		return "bassoon"; 
	}
	
	public int getSoundVolume() {
		return 9001;
	}
	
	public String color() {
		return "red but a little purple too";
	}
}