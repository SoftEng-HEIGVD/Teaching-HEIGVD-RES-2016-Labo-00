
package ch.heigvd.res.lab00;

/**
 *
 * @author franck
 */
public class Trumpet implements IInstrument{
    public String getColor(){
        return "golden";
    }
    public int getSoundVolume(){
        return 5;
    }
    
    public String play(){
        return "pouet";
    }
}
