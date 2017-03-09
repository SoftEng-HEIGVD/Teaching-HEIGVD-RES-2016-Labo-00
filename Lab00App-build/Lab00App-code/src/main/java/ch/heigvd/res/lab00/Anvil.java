/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Rafidimalala
 */

public class Anvil implements IInstrument{
    private String sound = "Tinn";
    private int volume = 6;
    private String color = "gray";
    
   public String play(){
       return sound;
   }
   public int getSoundVolume(){
       return volume;
   }
   public String getColor(){
       return color;
   }   
    
}
