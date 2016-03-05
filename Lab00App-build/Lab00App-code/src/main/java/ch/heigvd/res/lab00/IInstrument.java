package ch.heigvd.res.lab00;

/**
 *
 * @author Amel Dussier
 */
public interface IInstrument {
    
    // an instrument can be played
    String play();
    
    // an instrument has a sound volume
    int getSoundVolume();
    
    // an instrument has a color
    String getColor();
}
