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
interface IInstrument {
   String play();
   int getSoundVolume();
   String getColor();
   
}

class Trumpet implements IInstrument {
   
   @Override
   public String play() {
      return "pouet";
   }
   
   public int getSoundVolume() {
      return 2;
   }
   
   public String getColor() {
      return "golden";
   }
}

class Flute implements IInstrument {
   public int getSoundVolume() {
      return 1;
   }
   
   public String getColor() {
      return "black";
   }
   
   public String play() {
      return "tuuuuuut";
   }
}

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
