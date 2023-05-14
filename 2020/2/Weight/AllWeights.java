package Weight;

public class AllWeights {
  Weight[] arr;

  public Weight sum() {
    int totalGram = 0;
    for (int i = 0; i < this.arr.length; i++) {
      totalGram += this.arr[i].getKilo() * 1000 + this.arr[i].getGram();
    }

    return new Weight(totalGram);
  }
}
