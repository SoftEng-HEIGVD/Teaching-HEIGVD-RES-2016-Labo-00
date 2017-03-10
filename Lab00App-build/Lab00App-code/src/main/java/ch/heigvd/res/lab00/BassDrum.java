package ch.heigvd.res.lab00;

/**
 *
 * @author doriane kaffo
 */
public class BassDrum implements IInstrument {   
    
    private String color = "golden";
    private int soundVolume = 10;
    
    public BassDrum() { }
    public String play() { return "Badaboum";}
    public int getSoundVolume() {return soundVolume;}	
    public String getColor() {	return color;}
	
    
}
