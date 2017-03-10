package ch.heigvd.res.lab00;

/**
 * @author zeller quentin qrzeller
 */

public class  Bugle implements IInstruments{

    Bugle(){}

public String play(){
        return "pouetpouet";
    }

    public int getSoundVolume(){
        return 20;
    }

    public String getColor(){
        return "Shine like a diamond";
    }

}
