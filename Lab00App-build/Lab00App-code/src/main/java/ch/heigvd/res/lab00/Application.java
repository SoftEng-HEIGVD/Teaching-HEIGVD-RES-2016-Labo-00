package ch.heigvd.res.lab00;

/**
 * This is a very simple class used to demonstrate the specify-implement-validate
 * cycle. All methods used in the JUnit test are defined, so the test class will
 * compile. There is a bug in the add method, so one of the tests is expected
 * to fail.
 * 
 * If you look at the class named ch.heigvd.res.lab01.ApplicationTest, you will
 * find an executable specification for this class. The test methods specify
 * the expected behavior for this class.
 * 
 * @author Olivier Liechti
 */
public class Application {

  private String message;

  public Application() {
    this("HEIG-VD rocks!");
  }

  public Application(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public int add(int a, int b) {
    return a + b;
  }
}

interface IInstrument
{
    String play();
    int getSoundVolume();
    String getColor();
}

class Instrument implements IInstrument
{
    private String sound, color;
    private int volume;
    
    Instrument(int volume, String sound, String color)
    {
        this.volume = volume;
        this.sound = sound;
        this.color = color;
    }
    
    @Override
    public String play() 
    {
        return sound;
    }

    @Override
    public int getSoundVolume() 
    {
        return volume;
    }

    @Override
    public String getColor() 
    {
        return color;
    }
}

class Trumpet extends Instrument
{       
    Trumpet()
    {
        super(10, "pouet", "golden");
    } 
}

class Flute extends Instrument
{    
    Flute()
    {
        super(5, "fiu", "blue");
    }
}