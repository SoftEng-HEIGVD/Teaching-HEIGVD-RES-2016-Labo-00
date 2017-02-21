package ch.heigvd.res.lab00;

interface IInstrument{

    public String play();
    public int getSoundVolume();
     public String getColor();

}

class Trumpet implements IInstrument {

    private int volume = 10;
    private String couleur = "golden";

    public Trumpet(){

    }

    public String play()
    {
        return "pouet";
    }
    public int getSoundVolume()
    {
        return volume;
    }
    public String getColor()
    {
        return couleur;
    }


}

class Flute implements IInstrument {

    private int volume = 5;
    private String couleur = "blanc";

    public Flute(){

    }

    public String play()
    {
        return "pouet";
    }
    public int getSoundVolume()
    {
        return volume;
    }
    public String getColor()
    {
        return couleur;
    }
    
}
