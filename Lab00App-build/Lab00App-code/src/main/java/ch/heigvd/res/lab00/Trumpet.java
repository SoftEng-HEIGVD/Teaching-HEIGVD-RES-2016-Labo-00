package ch.heigvd.res.lab00;


public class Trumpet implements IInstrument {

//J'ai pris la decision de ne pas faire d'attributs color, sound et volume pour la simple
//raison que ce sont des methodes provenant d'une interface.

	@Override
    public String getColor() {
        return "golden";
    }
	
    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 30;
    }

}

