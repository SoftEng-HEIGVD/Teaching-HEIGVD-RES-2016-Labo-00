// Auteur: Patrick Champion
// Le code est "compresse" au vue de sa simplicite

package ch.heigvd.res.lab00;

interface IInstrument {
  public String play();
  public String getColor();
  public int getSoundVolume();
}

class Trumpet implements IInstrument {
  public String play() { return "pouet"; }
  public String getColor() { return "golden"; }
  public int getSoundVolume() { return 100; }
}

class Flute implements IInstrument {
  public String play() { return "fuii"; }
  public String getColor() { return "wood-like"; }
  public int getSoundVolume() { return 50; }
}
