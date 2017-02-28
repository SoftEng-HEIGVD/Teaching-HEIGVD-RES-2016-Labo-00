
package ch.heigvd.res.lab00;

/**
 *
 * @author SILVERCORP
 */
 class Trumpet implements IInstrument {
	 
	 private int soundVolume = 9;
	 private String sound = "pouet";
	 private String color = "golden";
   
    
   @Override
   public int getSoundVolume(){       
       return soundVolume;   
   }
   @Override
   public String play(){
      return sound ;
   }
   
   @Override
   public  String getColor(){
       return color;
   
   }
    
}
