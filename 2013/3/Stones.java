class Stones {
  private BiStone[] stones;

  public Stones() {
    this.stones = new BiStone[49];
    int index = 0;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        BiStone stone = new BiStone(i, j + 10);
        this.stones[index] = stone;

        index++;
      }
    }
  }
}
