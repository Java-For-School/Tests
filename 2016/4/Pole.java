public class Pole {
  public void sort() {
    Pole largePole = new Pole();
    Pole smallPole = new Pole();
    
    while (!this.isEmpty()) {
      Ring element = this.remove();
      if (element.getSize().equals("L")) largePole.add(element);
      else smallPole.add(element);
    }

    while (!largePole.isEmpty()) {
      this.add(largePole.remove());
    }
    while (!smallPole.isEmpty()) {
      this.add(smallPole.remove());
    }
  }
}
