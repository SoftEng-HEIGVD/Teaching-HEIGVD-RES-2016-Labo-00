
package ch.heigvd.res.lab00;


public class Flute implements IInstrument {
     public int getSoundVolume(){
        return 1;
    }
    public String getColor(){
        return "golden";
    }
    public String play(){
        return "pouet";
    }
}
