/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharie nguefack
 */
public class Timpani implements IInstrument {
    
    private sound = "doom";
    private volume = 11;
    
    public String play(){
        return sound;
    }
     public int getSoundVolume(){
        return volume;
     }
     
     public String getColor(){
         return this.color;
     }
    
}
