package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {
	
	public Orchestra(){
		tabInstrument = new LinkedList<IInstrument>();
	}
	public void addInstrument (IInstrument instrument){
		tabInstrument.add(instrument);
	}
	public int getNumberOfInstruments(){
		return tabInstrument.size();
	}
	public List<String> makeMusic(){
		
		List<String> listeSons = new LinkedList();
		
		for(IInstrument i: tabInstrument)
			listeSons.add(i.play());
		
		return  listeSons;
	}
	
	private LinkedList<IInstrument> tabInstrument;
}