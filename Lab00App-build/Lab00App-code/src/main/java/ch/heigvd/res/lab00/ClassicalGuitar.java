package ch.heigvd.res.lab00;

/**
 *
 * @author Tony Clavien
 */
public class ClassicalGuitar implements IInstrument {

	@Override
	public String play() {
		return "dwing";
	}

	
	@Override
	public int getSoundVolume() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	
	@Override
	public String getColor() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
