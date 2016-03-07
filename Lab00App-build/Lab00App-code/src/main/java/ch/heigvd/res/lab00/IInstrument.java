package ch.heigvd.res.lab00;

/**
 * This is a very simple interface representing an instrument
 *
 * @author Romain Albasini
 */
public interface IInstrument {
   String play();
   String getColor();
   int getSoundVolume();
}
