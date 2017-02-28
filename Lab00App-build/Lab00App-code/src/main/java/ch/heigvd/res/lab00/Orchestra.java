package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
	private ArrayList<IInstrument> instruments;
	
	public Orchestra() {
		instruments = new ArrayList<IInstrument>();
	}
	public void addInstrument(IInstrument instrument){
		instruments.add(instrument);
	}
	public int getNumberOfInstruments(){
		return instruments.size();
	}
	public List<String> makeMusic(){
		ArrayList<String> song = new ArrayList<String>();
		for(IInstrument instrument : instruments){
			song.add(instrument.play());
		}
		return song;
	}
}
