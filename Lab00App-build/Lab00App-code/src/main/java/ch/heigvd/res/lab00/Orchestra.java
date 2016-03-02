
package ch.heigvd.res.lab00;
import java.util.List;
import java.util.LinkedList;

public class Orchestra {
   
   private List<IInstrument> orchestraInstruments =  new LinkedList<IInstrument>();
   private int numberOfInstruments;
   
   
   public Orchestra(){}
   
   public int getNumberOfInstruments(){
      return numberOfInstruments;
   }
   
   public void addInstrument(IInstrument instrument){
      ++numberOfInstruments;
      orchestraInstruments.add(instrument);
   }
  public List<String> makeMusic(){
     List<String> instrumentsSounds = new LinkedList<String>();
     for (IInstrument instrument : orchestraInstruments)
        instrumentsSounds.add(instrument.play());
     
     return instrumentsSounds;
  }
   
  // List<MyType> myList = new ArrayList<MyType>();
}
