package Weight;

public class Weight {
  private int kilo;
  private int gram;

  public Weight() {
    this.kilo = 0;
    this.gram = 0;
  }
  public Weight(int kilo, int gram) {
    this.kilo = kilo;
    this.gram = gram;
  }
  public Weight(int totalGram) {
    this.gram = totalGram % 1000;
    this.kilo = totalGram / 1000;
  }
  public void add(Weight other) {
    int totalGram = this.kilo * 1000 + this.gram + other.getKilo() * 1000 + other.getGram();
    Weight newWeight = new Weight(totalGram);
    this.kilo = newWeight.getKilo();
    this.gram = newWeight.getGram();
  }
  public void less(Weight other) {
    int totalGram = this.kilo * 1000 + this.gram - other.getKilo() * 1000 - other.getGram();
    Weight newWeight = new Weight(totalGram);
    this.kilo = newWeight.getKilo();
    this.gram = newWeight.getGram();
  }
}
