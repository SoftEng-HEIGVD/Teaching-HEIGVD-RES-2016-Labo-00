package ch.heigvd.res.lab00;

/**
 * labo00
 * implementation de 2 classes et une interface IInstrument permettant de passer les tests unitaires
 * @author Jérémie Zanone
 */
interface IInstrument{

	public int getSoundVolume();
	public String play();
	public String getColor();
}

public class Trumpet implements IInstrument {

	public Trumpet() {
	}

	public String play() {
		return "pouet";
	}

	public int getSoundVolume() {
		return 50;
	}

	public String getColor() {
		return "golden";
	}

}


class Flute implements IInstrument{

	public Flute() {
	}

	public String play() {
		return "flop";
	}

	public int getSoundVolume() {
  		return 20;
 	}

 	public String getColor() {
 		return "silver";
 	}

}
