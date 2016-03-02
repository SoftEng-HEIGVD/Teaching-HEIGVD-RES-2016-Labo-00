// Auteur: Patrick Champion

package ch.heigvd.res.lab00;

import java.util.*;

class Orchestra {
	private LinkedList<IInstrument> instruments = new LinkedList<>();

	public int getNumberOfInstruments() {
		return instruments.size();
	}

	public void addInstrument(IInstrument instrument) {
		instruments.add(instrument);
	}

	public List<String> makeMusic() {
		LinkedList<String> noises = new LinkedList<>();
		for(IInstrument instrument : instruments)
			noises.add(instrument.play());
		return noises;
	}
}