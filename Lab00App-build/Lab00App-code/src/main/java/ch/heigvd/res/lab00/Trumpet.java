package ch.heigvd.res.lab00;

/**
 * Created by Ornidon on 24.02.2016.
 */
public class Trumpet extends IInstrument {
    public Trumpet(){
        super(1000, "golden");
    }

    public String play(){
        return "pouet";
    }
}
