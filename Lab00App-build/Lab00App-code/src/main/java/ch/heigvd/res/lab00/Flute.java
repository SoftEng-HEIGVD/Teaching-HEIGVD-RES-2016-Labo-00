package ch.heigvd.res.lab00;


public class Flute implements IInstrument {

	

    @Override
    public int getSoundVolume() {
        return 10;
    }
	
	@Override
    public String play() {
        return "fliflaflute";
    }
	
	@Override
    public String getColor() {
        return "brown";
    }

}