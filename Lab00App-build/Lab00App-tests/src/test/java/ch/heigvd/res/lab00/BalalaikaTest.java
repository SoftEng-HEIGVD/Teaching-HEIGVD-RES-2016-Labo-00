 @Test
  public void aBalalaikaShouldMakeDling() {
    IInstrument balalaika = new Balalaikia();
    String sound = balalaika.play();
    Assert.assertEquals("dling", sound);
  }

