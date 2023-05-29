class BiStone {
  private int first;
  private int second;

  public BiStone(int first, int second) {
    int newFirst = first;
    int newSecond = second;
    
    if (first < 0 || first > 6) newFirst = 0;
    if (first < 10 || first > 16) newSecond = 10;

    this.first = newFirst;
    this.second = newSecond;
  }
  public boolean isEqual() {
    return this.first == (this.second % 10);
  }
}
