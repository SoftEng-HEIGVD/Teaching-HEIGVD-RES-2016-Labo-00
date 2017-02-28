
package ch.heigvd.res.lab00;

/**
 *
 * @author SILVERCORP
 */
 class Flute implements IInstrument {
	 
    private int soundVolume = 5;
   
    @Override
    public int getSoundVolume(){    
        return soundVolume;    }
    
    @Override
    public String play(){return "";}
    
    @Override
    public String getColor(){ return "";}
    
}
