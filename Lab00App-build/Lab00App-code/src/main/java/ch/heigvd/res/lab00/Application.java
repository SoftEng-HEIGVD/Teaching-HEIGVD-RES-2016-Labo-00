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
    return a * b;
  }

}



interface IInstrument {
    
    String play();
    int getSoundVolume();
    String getColor();
}

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
        color = "golden";
        return color;
    }
}