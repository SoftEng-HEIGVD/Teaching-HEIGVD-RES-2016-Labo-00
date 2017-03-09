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

/* méthode avec des classes
class IInstrument{
    String sound, color;
    int volume;

    IInstrument(String sound, int volume, String color) {
        this.sound = sound;
        this.volume = volume;
        this.color = color;
    }
    
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

class Trumpet extends IInstrument{
    public Trumpet(){
        super("pouet", 100, "golden");
    }
}

class Flute extends IInstrument{
    public Flute(){
        super("sonFlute", 50, "grey");
    }
}
*/

/* méthode avec une interface */

interface IInstrument{
    public String play();
    public int getSoundVolume();
    public String getColor();
}

class Trumpet implements IInstrument{
    @Override
    public String play(){
        return "pouet";
    }
    @Override
    public int getSoundVolume(){
        return 100;
    }
    @Override
    public String getColor(){
        return "golden";
    }
}

class Flute implements IInstrument{
    @Override
    public String play(){
        return "sonFlute";
    }
    @Override
    public int getSoundVolume(){
        return 50;
    }
    @Override
    public String getColor(){
        return "grey";
    }
}