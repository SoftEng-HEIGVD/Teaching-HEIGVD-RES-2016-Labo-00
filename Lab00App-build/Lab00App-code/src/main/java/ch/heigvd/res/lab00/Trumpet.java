/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author dbnsky
 */

interface IInstrument{

   String play();
   int getSoundVolume();
   String getColor();
}

public class Trumpet implements IInstrument{
    public String play(){
        return "pouet";
    }
    
    public int getSoundVolume(){
        return 180;
    }
    
    public String getColor(){
        return "golden";
    }
    
}