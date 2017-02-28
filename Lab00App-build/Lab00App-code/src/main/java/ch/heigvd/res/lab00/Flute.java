package ch.heigvd.res.lab00;

public class Flute implements IInstrument{
    public String play(){
        return "trilili";
    }
    public int getSoundVolume(){
        return 3;
    }
    public String getColor(){
        return "wooden";
    }
}