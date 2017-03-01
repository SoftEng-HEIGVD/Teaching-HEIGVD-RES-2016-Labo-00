package ch.heigvd.res.lab00;

/**
 * This is the class Bow that implements
 * the interface IInstrument asked by the teacher
 * 
 * @author Gonzalez Montes Nathan
 */

class Bow implements IInstrument {
    
    String sound;
    int volume;
    String color;
    
    public Bow() {
        
    }
    
    @Override
    public String play() {
        sound = "pouet";
        return sound;
    }
    
    @Override
    public int getSoundVolume() {
        volume = 100;
        return volume;
    }
    
    @Override
    public String getColor() {
        color = "brown";
        return color;
    }
}
