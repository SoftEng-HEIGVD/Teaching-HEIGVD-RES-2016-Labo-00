package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Orchestra {
	private LinkedList<IInstrument> instruments = new LinkedList<>();

	public int getNumberOfInstruments() {
		return instruments.size();
	}

	public void addInstrument(IInstrument trumpet) {
		instruments.push(trumpet);
	}

	public List<String> makeMusic() {
		return instruments.stream().map(IInstrument::play).collect(Collectors.toList());
	}
}
