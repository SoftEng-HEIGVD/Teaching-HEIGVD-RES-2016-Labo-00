package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
	private
		ArrayList<IInstrument> listInst;
	public Orchestra(){
		listInst = new ArrayList<IInstrument>();
		}
	public int getNumberOfInstruments(){
		return listInst.size();
		}
	public void addInstrument(IInstrument i){
		listInst.add(i);
	}
	public List<String> makeMusic(){
		List<String> sounds = new ArrayList<String>();
		for(IInstrument i : listInst){
			sounds.add(i.play());
		}
		return sounds;
	}
}
